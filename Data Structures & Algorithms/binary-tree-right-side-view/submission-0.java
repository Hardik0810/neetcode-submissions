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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> list = levelOrder(root);
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            res.add(list.get(i).get(list.get(i).size() - 1));
        }
        return res;
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for(int i = q.size(); i > 0; i--){
                TreeNode n = q.poll();
                if(n != null){
                    list.add(n.val);
                    q.add(n.left);
                    q.add(n.right);
                }
            }
            if(list.size() > 0){
                arr.add(list);
            }
        }
        return arr;   
    }
}
