class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
       double currsum=sum;
       for(int i=k;i<nums.length;i++)
       {
        currsum+=nums[i]-nums[i-k];
        sum=Math.max(currsum,sum);
       }
        return sum/k;
    }
}