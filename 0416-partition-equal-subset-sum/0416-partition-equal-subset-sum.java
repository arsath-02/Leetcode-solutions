class Solution {
    public boolean canPartition(int[] nums) {
      int sum=0;
      for(int i:nums){
        sum+=i;
      }
      //System.out.print(sum);
      if(sum%2!=0)
      return false;
      int t=sum/2;
      boolean dp[] = new boolean[t+1];
      dp[0]=true;
      for(int num:nums){
        for(int i=t;i>=num;i--){
            dp[i]=dp[i]||dp[i-num];
        }
      }
      return dp[t];
    }
}