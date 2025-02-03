class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        //int count1=0,count2=0;
        int in=1,de=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                in++;
                de=1;
            }
            //count1++;
            else if(nums[i]<nums[i+1]){
                de++;
                in=1;
            }
            //count2++;
            else{
                in=1;
                de=1;
            }
            count=Math.max(count,Math.max(in,de));
        }
        return count;
    }
}