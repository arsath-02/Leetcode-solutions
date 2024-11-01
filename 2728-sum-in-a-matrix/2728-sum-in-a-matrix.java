class Solution {
    public int matrixSum(int[][] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            Arrays.sort(nums[i]);
        }
        int sum=0,max=0;
        for(int i=0;i<nums[0].length;i++)
        {
            max=0;
            for(int j=0;j<nums.length;j++)
            {
                max=Math.max(max,nums[j][i]);
            }
            sum+=max;
        }
        return sum;
    }
}