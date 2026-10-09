class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = Arrays.stream(piles).max().getAsInt();
        if(piles.length == h){
            return r;
        }
        int l = 1;
        int count = r;
        while(l<r){
            int mid = l + (r - l)/2;
            int tt  = 0;
            for(int pile : piles){
                tt += Math.ceil((double)pile/mid);
            }
            if(tt <= h){
                count = mid;
                r = mid;
            }
            else{
                l = mid + 1;
            }
            

        }
        return count;

        
    }
}
