
class Solution {
    public void backtrack(int start, List<Integer> curr, List<List<Integer>> res, int target, int[] candidates) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;  
            curr.add(candidates[i]);
            backtrack(i + 1, curr, res, target - candidates[i], candidates);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, curr, res, target, candidates);
        return res;
    }

}