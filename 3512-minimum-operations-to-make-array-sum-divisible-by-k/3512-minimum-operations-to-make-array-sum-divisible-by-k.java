class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int res = sum % k;
        return res; 
    } 
}