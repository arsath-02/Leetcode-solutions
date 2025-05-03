class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int sell = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0; i< n ;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            sell=Math.max(sell,prices[i]-buy);
        } 
        // System.out.print(min);
        return sell;
    }
}