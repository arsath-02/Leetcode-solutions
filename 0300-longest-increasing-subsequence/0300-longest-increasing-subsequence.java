class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int result[] = new int[n];
        Arrays.fill(result , 1);
        int max=1;

        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    result[i]=Math.max(result[i],1+result[j]);
                    max=Math.max(max,result[i]);
                }
            }
        }
        return max;
    }
}