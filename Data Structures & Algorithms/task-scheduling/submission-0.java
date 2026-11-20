class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            arr[tasks[i] - 'A']++;
        }

        Queue<int[]> q = new LinkedList<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                maxHeap.offer(arr[i]);
            }
        }
        int time = 0;

        while(!maxHeap.isEmpty() || !q.isEmpty()){
            time++;

            if(!maxHeap.isEmpty()){
                int j = maxHeap.poll();
                j--;
                if(j != 0){
                    q.add(new int[]{j, time + n});
                }
            }
            if(!q.isEmpty() && q.peek()[1] == time){
                maxHeap.offer(q.poll()[0]);
            }
        }
        return time;
    }
}
