class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        helper(list, 0, l, target, nums, 0);
        return list;
        
    }
    public void helper(List<List<Integer>> list, int sum, List<Integer> l, int target, int[] nums,int i){
        if(sum == target){
            list.add(new ArrayList<>(l));
            return;
        }
        if(sum > target || i >= nums.length){
            return;
        }
        l.add(nums[i]);
        helper(list, sum  + nums[i], l, target, nums, i);
        l.remove(l.size() - 1);
        helper(list, sum, l, target, nums, i + 1);
        return ;

    }
}
