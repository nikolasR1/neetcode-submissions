class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int l = 0;
        int r = 1;
        int max = 0;

        while( r < prices.length){
            if(prices[r] > prices[l]){
                profit = prices[r] - prices[l];
                max = Math.max(max, profit);
            }else{
                l = r;
            }
            r++;
        }
        return max;
    }
}
