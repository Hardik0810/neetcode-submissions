class Solution {
    public int[] twoSum(int[] num, int target) {
        if(num.length <= 1){
            return null;
        };
        int p1 = 0;
        int p2 = num.length - 1;
        while(true){
            if(p2 < p1 || p2 < 0 || p1 >= num.length){
                return null;
            }
            else if(num[p1] + num[p2] > target){
                p2--;
            }
            else if(num[p1] + num[p2] < target){
                p1++;
            }
            else if(num[p1] + num[p2] == target){
                int[] arr = new int[2];
                arr[0] = p1+1;
                arr[1] = p2+1;
                return arr;
            }
        }
        


        
    }
}
