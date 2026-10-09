class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                int j = map.get(diff);
                arr[0] = j;
                arr[1] = i; 
                break;
            }
            map.put(nums[i], i );
        };
        return arr;
        


    }
}
