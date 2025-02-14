class Solution {
    public boolean canPlace(int col, int row, List<String> curr) {
        for (int i = row - 1; i >= 0; i--) {
            if (curr.get(i).charAt(col) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (curr.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < curr.size(); i--, j++) {
            if (curr.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            curr.add(".".repeat(n));
        }
        backtrack(0, curr, res);
        return res;
    }

    public void backtrack(int row, List<String> curr, List<List<String>> res) {
        if (row == curr.size()) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int col = 0; col < curr.size(); col++) {
            if (canPlace(col, row, curr)) {
                StringBuilder sb = new StringBuilder(curr.get(row));
                sb.setCharAt(col, 'Q');
                curr.set(row, sb.toString());
                backtrack(row + 1, curr, res);
                sb.setCharAt(col, '.');
                curr.set(row, sb.toString());
            }
        }
    }
}
