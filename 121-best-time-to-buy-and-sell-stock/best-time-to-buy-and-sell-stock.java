class Solution {
    public int maxProfit(int[] prices) {
        int minsoFar = prices [0];
        int ans = 0;
        for ( int i =1 ; i< prices.length ; i++) {
            int profit = prices[i] - minsoFar;
            if(profit > ans ){
                ans = profit;
            }
            minsoFar = Math.min(prices[i],minsoFar);
        }
return ans;
        
    }
}