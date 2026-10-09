class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(nums, 0, list, new ArrayList<>());
        return list;


        
    }
   public void helper(int[] nums , int i, List<List<Integer>> list, List<Integer> l){
        if(i >= nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[i]);
        helper(nums, i + 1, list, l);
        
        
        l.remove(l.size() - 1);
        helper(nums, i + 1, list, l);
        return;
   }
}
