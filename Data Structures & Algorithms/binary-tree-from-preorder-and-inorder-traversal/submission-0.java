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

class Solution {
    int i = 0;
    int j = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, Integer.MAX_VALUE);
        
        

    }

    public TreeNode helper(int[] pre , int[] in, int limit){
        if(i >= pre.length){
            return null;
        }
        if(in[j] == limit){
            j++;
            return null;
        }
        
        TreeNode node = new TreeNode(pre[i]);
        i++;
        node.left = helper(pre, in, node.val);
        node.right = helper(pre, in, limit);

        
        return node;
          
    }
}
