/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return helper(root);
        
    }
    public String helper(TreeNode root){
        if(root == null){
            return "N,";
        }
        String left = helper(root.left);
        String right = helper(root.right);

        return root.val + "," + left + right;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return helper(arr);
       
 
    }
    int idx = 0;

public TreeNode helper(String[] arr) {
    if (idx >= arr.length || arr[idx].equals("N")) {
        idx++;
        return null;
    }

    TreeNode node = new TreeNode(Integer.parseInt(arr[idx++]));
    node.left = helper(arr);
    node.right = helper(arr);

    return node;
}

}
