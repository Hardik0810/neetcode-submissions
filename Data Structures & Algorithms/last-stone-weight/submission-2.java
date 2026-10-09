class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0){
            return 0;
        }
    
        int i = 0;
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        while(i < stones.length){
            q.add(stones[i]);
            i++;
        }
        int p, r = 0;
        while(q.size() != 0 && q.size() != 1){
            p = q.poll();
            r = q.poll();
            if(p == r){
                continue;
            }
            else{
                int s = Math.abs(p-r);
                q.add(s);
            }
        }
        return q.size() != 0?q.poll():0;
        
        
    }
}
