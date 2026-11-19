class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int max = 0;
        int pse = -1;
        int nse = -1;

        for(int i = 0; i < heights.length; i++){

            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                nse = i;
                int curr = heights[st.pop()];
                if(st.isEmpty()){
                    pse = -1;
                }
                else{
                    pse = st.peek();
                } 
                max = Math.max(max, curr * (nse - pse - 1));
            }
            st.push(i);
        } 
        while(!st.isEmpty()){
            nse = heights.length;
            int curr = heights[st.pop()];
             if(st.isEmpty()){
                    pse = -1;
                }
                else{
                    pse = st.peek();
                } 
            
            max = Math.max(max, curr * (nse - pse - 1));
        }       
        return max;
    }
}
