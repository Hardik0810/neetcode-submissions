class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3){
            return result ;
        }
        int[] temp = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
       
        
        int i = 0;
        while(i < nums.length - 2){
            if (i > 0 && nums[i] == nums[i - 1]){
                i++;
                continue;
            } ;
            int j  = i + 1;
            int k = nums.length - 1;
            while(j < k){
                List<Integer> triplet = new ArrayList<>();
                if(nums[i] == -(nums[j] + nums[k])){
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    result.add(triplet);
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) j++;

            

                }
                else if(-(nums[i])  > (nums[j] + nums[k])){
                    j++;
                }
                else if (-(nums[i])  <= (nums[j] + nums[k])){
                    k--;
                }
            }
            i++;
        }
        return result;
    }

    


    private  void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

    private  void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // copy current range to temp
        for (int i = left; i <= right; i++) temp[i] = arr[i];

        int i = left;      // pointer for left half
        
        int j = mid + 1;   // pointer for right half
        int k = left;      // write pointer into arr

        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) arr[k++] = temp[i++]; // stable
            else arr[k++] = temp[j++];
        }

        while (i <= mid) arr[k++] = temp[i++];
        // right half leftovers already in place
    

    }

    
}
