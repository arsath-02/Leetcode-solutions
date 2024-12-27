class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int n=prices.length;
        int minprice=prices[0];
        int sell=0;
        while(sell<n){
            if(prices[sell]<minprice)
            minprice=prices[sell];
            if(prices[sell]-minprice>maxprofit)
            maxprofit=prices[sell]-minprice;

        sell++;
        }
        return maxprofit;
    }
}