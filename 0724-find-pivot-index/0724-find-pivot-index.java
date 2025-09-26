class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0;
        for(int i:nums){
            tot+=i;
        }
        int pref = 0,suff = 0;
        for(int i =0;i<nums.length;i++){
            suff = tot - pref - nums[i];
            if(suff == pref) return i;
            pref += nums[i];
        }
        return -1;
    }
}