class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] bool = new boolean[nums.length];
        helper(list, new ArrayList<Integer>(), 0, nums, bool);
        return list;

        
    }
    public void helper(List<List<Integer>> list, List<Integer> l, int i, int[] nums, boolean[] bool){
        if(i == nums.length){
            list.add(new ArrayList<>(l));
            return;
        }

        for(int j = 0; j < nums.length; j++){
            if(!bool[j]){
                bool[j] = true;
                l.add(nums[j]);
                helper(list, l, i + 1, nums, bool);
                l.remove(l.size() - 1);
                bool[j] = false;
            }


        }
        return;




    }
}
