class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int curr = 0;
        for(int i:nums){
            curr = (curr * 2 + i) % 5;
            res.add(curr % 5 == 0);
        }
        return res;
    }
}