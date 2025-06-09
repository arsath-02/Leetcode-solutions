class Solution {
    public boolean canJump(int[] nums) {
        int i=0;

        for(int r=0;i<nums.length&& i<=r;i++)
        {
            r=Math.max(r,i+nums[i]);
        }
        return i==nums.length;
    }
}