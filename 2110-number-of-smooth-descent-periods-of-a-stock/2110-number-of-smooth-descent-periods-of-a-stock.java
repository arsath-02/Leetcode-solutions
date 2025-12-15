class Solution {
    public long getDescentPeriods(int[] prices) {
        
        long c = 1 , ans = 1;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] == prices[i-1]-1){
                c++;
                ans+=c;
            }else{
                c =1;
                ans+=1;
            }
        }
        return ans;
    }
}