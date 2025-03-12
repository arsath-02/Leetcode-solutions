class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int rl = matrix.length;
        int cl = matrix[0].length;
        int[] rm = new int[rl];
        int[] cm = new int[cl];
        
       
        for (int i = 0; i < rl; i++) {
            for (int j = 0; j < cl; j++) {
                if (matrix[i][j] == 0) {
                    rm[i] = 1;
                    cm[j] = 1;
                }
            }
        }
        
       
        for (int i = 0; i < rl; i++) {
            for (int j = 0; j < cl; j++) {
                if (rm[i] == 1 || cm[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        return matrix;
    }
}
