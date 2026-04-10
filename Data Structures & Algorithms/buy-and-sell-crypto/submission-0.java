class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int max = 0;

        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - minPrice;
            if(profit > max){
                max = profit;
            }

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }

        return max;
    }
}
