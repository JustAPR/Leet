class Solution {
    public int maxProfit(int[] prices) {
        int profut = 0;
        for(int i = 1; i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profut+=prices[i] - prices[i-1];
            }

        }
        return profut;
    }
}