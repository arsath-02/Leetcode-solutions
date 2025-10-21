class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int res[] = new int[n*m];
        int i =0;
        int row = 0,col = 0;
        for(int d = 0;d<n+m-1;d++){
            if(d%2==0){
                row = Math.min(d,n-1);
                col = d - row;
                while(row >= 0 && col < m){
                    res[i++] = mat[row][col];
                    row--;
                    col++;
                }
            }
            else{
                    col = Math.min(d,m-1);
                    row = d - col;
                    while(col >= 0 && row<n){
                        res[i++] = mat[row][col];
                        row++;
                        col--;
                    }
                }
        }
            return res;
    }
}