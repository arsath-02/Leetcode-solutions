class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int dp[][] = new int[n][m];
        for(int i[] :dp){
            Arrays.fill(i,-1);
        }
        return backtrack(0,0,n,m,dp,obstacleGrid);
         
    }
    public int  backtrack(int r,int c,int n ,int m ,int dp[][],int grid[][]){
        if(r>=n || c>=m || r<0 || c<0 || grid[r][c] == 1){
            return 0;
        }
        if(r == n-1 && c == m-1) return 1;
        if(dp[r][c]!= -1) return dp[r][c];
        return dp[r][c] = backtrack(r+1,c,n,m,dp,grid) + backtrack(r,c+1,n,m,dp,grid);
    }
}