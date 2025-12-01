class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int[n+1][n+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return helper(s,0,n-1,dp);
    }
    public int helper(String s, int l ,int r,int [][]dp){
        if(l>r) return 0;
        if(l == r) return 1;
        if(dp[l][r] != -1) return dp[l][r];
        if(s.charAt(l) == s.charAt(r)){
            dp[l][r] = 2 + helper(s,l+1,r-1,dp);
        }else{
            dp[l][r] = Math.max(helper(s,l+1,r,dp),helper(s,l,r-1,dp));
        }
        return dp[l][r];
    }
}