class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> q = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        for(int[] p : points){
            int d = (p[0] * p[0]) + (p[1] * p[1]);
            q.add(new int[]{d, p[0], p[1]});
        }
        int[][] result = new int[k][2];
        for(int i = 0; i< k; i++){
            int[] point = q.poll();
            result[i][0] = point[1];
            result[i][1] = point[2];
        }
        return result;
        

    }
}
