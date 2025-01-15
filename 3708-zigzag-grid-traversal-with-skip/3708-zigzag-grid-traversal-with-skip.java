public class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    if (j % 2 == 0) {
                        ans.add(grid[i][j]);
                    }
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    if (j % 2 == 1) {
                        ans.add(grid[i][j]);
                    }
                }
            }
        }
        
        return ans;
    }
}
