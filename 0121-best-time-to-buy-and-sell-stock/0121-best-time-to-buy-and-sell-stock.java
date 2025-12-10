class Solution {
    public int maxProfit(int[] prices) {
        int max =Integer.MIN_VALUE;
        int profit = Integer.MAX_VALUE;
        for(int i:prices){
            profit = Math.min(profit,i);
            max = Math.max(max,i - profit);
        }
        return max;
    }
}