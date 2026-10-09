class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pfx = 1;
        int[] arr = new int[nums.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = pfx;
            pfx *= nums[i];
        };
        int sfx = 1;
        for(int i = nums.length - 1; i >= 0; i-- ){
            arr[i] = sfx * arr[i];
            sfx  = sfx * nums[i];
        }
        return arr;
        
    }
}  
