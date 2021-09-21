//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        
        for(int i=0; i<n; i++) {
            int temp=0;
            for(int j=i+1; j<n; j++) {
                if(prices[i] >= prices[j]) {
                    temp = prices[j];
                    break;
                }
            }
            prices[i] -= temp;
        }
        
        return prices;
    }
}
