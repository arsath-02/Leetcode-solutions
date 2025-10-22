class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n];
        int col[] = new int[m];

        for(int i=0;i<n;i++){
            int min =Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                if(matrix[i][j]<min)
                min = matrix[i][j];
            }
            row[i]=min;
            // System.out.println(row[i]);
        }
        
        for(int i=0;i<m;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++){
                if(matrix[j][i]>max)
                 max=matrix[j][i];
            }
            col[i]=max;
            // System.out.println(col[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==row[i] && matrix[i][j]==col[j]){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}