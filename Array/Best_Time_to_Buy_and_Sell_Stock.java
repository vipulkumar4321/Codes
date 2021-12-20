//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        if(prices.length <= 1 || prices == null)
            return 0;
        
        int minPrice = Integer.MAX_VALUE;
        
        for(int i=0; i<prices.length; i++) {
            if(minPrice > prices[i]){
                minPrice = prices[i];
            } else if((prices[i] - minPrice) > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}
