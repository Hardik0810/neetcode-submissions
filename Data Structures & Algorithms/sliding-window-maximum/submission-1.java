class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int r = 0;

        Deque<Integer> deq = new ArrayDeque<>(); 
        int[] arr = new int[nums.length - k + 1];
        int i = 0;

        while(r < nums.length){
            while(deq.size() != 0 && nums[deq.peekLast()] < nums[r]){
                deq.removeLast();
            }
            deq.addLast(r);
            if(r >= k - 1){
                arr[i] = nums[deq.peekFirst()];   
                i++; 
                if(r - deq.peekFirst() + 1 == k){
                    deq.removeFirst();
                }   
            }
            r++;
        }
        return arr;
       

        
    }
}
