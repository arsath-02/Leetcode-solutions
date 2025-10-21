class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0;
        int max = Integer.MAX_VALUE;
        int sum =0;
        for(int r =0;r<nums.length;r++){
            sum +=nums[r];
            while(sum>=target){
                sum -=nums[l];
                max = Math.min(max,r-l+1);
                l++; 
            }
        }
        return max == Integer.MAX_VALUE ? 0 : max;
    }
}