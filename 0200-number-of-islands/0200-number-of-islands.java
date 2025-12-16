class Solution {
    public int res = 0;
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if(grid == null || n == 0) return 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]== '1'){
                    dfs(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }
    public void dfs(char[][] grid,int r,int c){
        int n = grid.length;
        int m = grid[0].length;
        if(r<0 || r>=n || c < 0 || c >= m || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';

        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}