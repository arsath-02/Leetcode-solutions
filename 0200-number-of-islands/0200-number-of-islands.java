class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0) return 0;
        int r = grid.length;
        int c = grid[0].length;
        int num = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    num++;
                }
            }
        }
        return num;
    }
    public void dfs(char grid[][],int r,int c){
        int n = grid.length;
        int m = grid[0].length;

        if(r<0 || c<0 || r>=n ||c>=m || grid[r][c]== '0') return;
        grid[r][c]='0';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }

}