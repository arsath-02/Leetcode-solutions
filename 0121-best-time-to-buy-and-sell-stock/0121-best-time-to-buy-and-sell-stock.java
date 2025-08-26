class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = Integer.MAX_VALUE;
        int i = 0; 

        // Greedy Approach
        // TC: O(n);
        // SC: O(1);
        for(int price:prices){
            buy = Math.min(price , buy);
            maxProfit =Math.max(maxProfit,price - buy);
        }
        return maxProfit;
    }
}