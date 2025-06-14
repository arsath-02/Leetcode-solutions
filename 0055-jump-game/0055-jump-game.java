class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int r=0;
        while(i<=r && i<nums.length){
            r=Math.max(r,i+nums[i]);
            i++;
        }
        return i==nums.length;
    }
}