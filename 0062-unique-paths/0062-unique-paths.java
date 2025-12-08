class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(int []i:dp){
            Arrays.fill(i,-1);
        }
        
        return backtrack(0,0,m,n,dp);
    }
    private int backtrack(int r,int c,int m,int n,int [][]dp){
        if(r<0 || c<0 || r>=m || c>=n) return 0;
        if(r==m-1 || c==n-1) return 1;
        if(dp[r][c] != -1) return dp[r][c];
        return dp[r][c]=backtrack(r+1,c,m,n,dp) + backtrack(r,c+1,m,n,dp);
    }
}