class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        int n = nums.length;
        for(int i=1;i <= n;i++){
            res = res ^ i;
        }
        for(int i =0; i<n; i++){
            res = res ^ nums[i];
        }
        return res;
    }
}