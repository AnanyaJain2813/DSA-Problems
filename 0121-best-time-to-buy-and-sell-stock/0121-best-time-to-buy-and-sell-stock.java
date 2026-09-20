class Solution {
    public int maxProfit(int[] prices) {

        // int m_profit = 0;
        // for(int i = 0; i < prices.length; i++){
        //     int profit = 0;
        //     int buy = prices[i];
        //     for(int j = i + 1; j < prices.length; j++){
        //         profit = prices[j] - buy;
        //         m_profit = Math.max(profit, m_profit);
        //     }
        // } 
        // return m_profit;

        int max = 0;
        int buy = prices[0];
        for(int i = 1; i < prices.length; i++){
            int p = prices[i] - buy;
            buy = Math.min(buy, prices[i]);
            max = Math.max(p, max);
        }
        return max;
    }
}