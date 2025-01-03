class Solution {
    public void backtrack(int start, List<Integer> curr, List<List<Integer>> res, int k, int n) {
        if (curr.size() == k) {
            if (n == 0) {
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            curr.add(i);
            backtrack(i + 1, curr, res, k, n - i);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(1, curr, res, k, n);
        return res;
    }
}
