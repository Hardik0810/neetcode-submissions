class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        mergeSort(candidates, 0, candidates.length - 1);
        helper(list, l, 0, 0, target, candidates);
        return list;

        
    }
    public void helper(List<List<Integer>> list, List<Integer> l, int sum, int i, int target, int[] nums){
        if(sum == target){
            list.add(new ArrayList<>(l));
            return;
        }
        else if(sum > target || i >= nums.length){
            return ;
        }
        l.add(nums[i]);
        helper(list, l, sum + nums[i], i + 1, target, nums);
        l.remove(l.size() - 1);
        while(i != nums.length - 1 && nums[i] == nums[i + 1]){
            i++;
        }
        helper(list, l, sum, i + 1, target, nums);
        return;
    }
    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge the two sorted arrays
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
}
