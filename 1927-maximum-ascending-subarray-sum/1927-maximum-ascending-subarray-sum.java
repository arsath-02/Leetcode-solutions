class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int count=nums[0],max=0;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                count+=nums[i];
            }
            else{
                max=Math.max(max,count);
                count=nums[i];
            }
        }
        return Math.max(max,count);
    }
}