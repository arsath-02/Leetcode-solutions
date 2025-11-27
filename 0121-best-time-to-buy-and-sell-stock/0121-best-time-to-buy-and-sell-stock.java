class Solution {
    public int maxProfit(int[] prices) {
        int buy =Integer.MAX_VALUE;
        int max = 0;
        for(int p:prices){
            buy = Math.min(buy,p);
            max = Math.max(max, p-buy);
        }
        return max;
    }
}