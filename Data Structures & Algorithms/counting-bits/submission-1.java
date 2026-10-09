class Solution {
    public int[] countBits(int n) {
        int count = 2;
        int[] nums = new int[n + 1];
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || i == 1){
                nums[i] = i;
            }
            else if(i == count){
                nums[i] = 1;
                count *= 2;
            }
            else{
                nums[i] = nums[count/2] + nums[i - (count/2)];
            }
        }
        return nums;
    }
}
