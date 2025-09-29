class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(1,k,n,new ArrayList<>());
        return res;
    }
    private void backtrack(int st , int k,int target,List<Integer> curr){
        if(target == 0 && curr.size()==k){
            res.add(new ArrayList<>(curr));
        }
        if(target< 0 || curr.size()>k) return;

        for(int i=st;i<=9;i++){
            curr.add(i);
            backtrack(i+1,k,target -i ,curr);
            curr.remove(curr.size()-1);
        }
    }
}