class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int n : nums){
            if(res.isEmpty() || res.get(res.size()-1)< n ){
                res.add(n);
            }
            else{
                int ind = binary(res,n);
                res.set(ind,n);
            }
        }
        return res.size();
    }
    public int binary(List<Integer> res,int target){
        int l = 0,r = res.size()-1;
        while(l <= r){
            int mid = (l + r ) / 2;
            if(res.get(mid) == target){
                return mid;
            }
            else if(res.get(mid) < target){
                l = mid +1;
            }
            else{
                r = mid -1;
            }
        }
        return l;
    }
}