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
    public List<List<Integer>> levelOrder(TreeNode root) {
         Queue<TreeNode> q = new LinkedList();
         List<List<Integer>> list = new ArrayList();

         q.add(root);
         while(q.size() != 0){
            List<Integer> list2 = new ArrayList<>();
            int a = q.size();
            for(int i = 0; i < a;i++){
                TreeNode node = q.poll();
                if(node != null){
                    list2.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(list2.size() > 0){
                list.add(list2);
            }
            
         }
         return list;





        

        
        
    }
    
}
