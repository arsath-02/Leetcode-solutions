class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=-1;
        for(int i=1;i<n;i++){
            if(min<nums[i])
            max=Math.max(max,nums[i]-min);
            else
            min=nums[i];
        }
        return max;
    }
}