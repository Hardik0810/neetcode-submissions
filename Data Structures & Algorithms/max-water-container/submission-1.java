class Solution {
    public int maxArea(int[] heights) {
        if(heights.length <= 1){
            return -1;
        }
        int p1 = 0;
        int p2 = heights.length - 1;
        int mx = 0;
        while(p1 < p2){
            int width = Math.min(heights[p1], heights[p2]);
            int height = p2 - p1;
            int area = width * height;
            if(mx < area){
                mx = area;
            };
            if(heights[p2] > heights[p1]){
                p1++;
            }
            else if(heights[p1] >= heights[p2]){
                p2--;
            }
        }
        return mx;
        
    }
}
