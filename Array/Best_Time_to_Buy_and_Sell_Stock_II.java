//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        if(prices.length <= 1 || prices == null)
            return 0;
        
        int buyAt = 0;
        int sellAt = 0;
        int flag = 0;
        
        for(int i=0; i<prices.length-1; i++) {
            if(prices[i] < prices[i+1]) {
                if(flag == 0)
                    buyAt = prices[i];
                flag++;
            } else {
                if(flag != 0) { 
                    sellAt = prices[i];
                    maxProfit += (sellAt - buyAt);
                    // System.out.println(sellAt + " " + buyAt);
                }
                flag = 0;
            }
        }
        
        if(prices[prices.length-1] > buyAt && flag !=0) {
            maxProfit += (prices[prices.length-1] - buyAt);
        }
        
        return maxProfit;
    }
}
