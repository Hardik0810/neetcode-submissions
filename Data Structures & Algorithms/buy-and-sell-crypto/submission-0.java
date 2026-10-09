class Solution {
    public int maxProfit(int[] prices) {
        int pDay = 0;
        int sDay = 1;
        int maxProfit = 0;
        while(sDay < prices.length){
            if(prices[pDay] > prices[sDay]){
                pDay = sDay;
            }
            else{
                maxProfit = Math.max(maxProfit ,prices[sDay] - prices[pDay]);

            }
            sDay++;
        }
        return maxProfit;
        
    }
}
