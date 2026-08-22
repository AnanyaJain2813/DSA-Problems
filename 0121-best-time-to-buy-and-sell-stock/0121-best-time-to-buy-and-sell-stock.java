class Solution {
    public int maxProfit(int[] prices) {

    //     int max_profit = 0;
    //     int n = prices.length;
    //     int buy = prices[0];
    //     for(int i = 1; i < n; i++){
    //          int profit = prices[i] - buy;
    //          max_profit = Math.max(profit, max_profit);
    //          buy = Math.min(buy, prices[i]);
    //     }

        
    //     return max_profit;

     int max = 0;
     int min = prices[0];
     int profit = 0;
     for(int i = 1; i < prices.length; i++){
        profit = prices[i] - min;
        if(profit < 0){
            min = prices[i];
        }
        else{
            max = Math.max(max, profit);
        }
     }
     return max;
    }
}