class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        // if(n==1) return nums[0]
        int sum =0;
        for(int i = 0;i<k ;i++){
            sum +=nums[i];
        }
        double max=sum;
        for(int i = k;i<n;i++){
            sum -= nums[i-k];
            sum+=nums[i];
            max = Math.max(max,sum);
        }
        return max/k;
    }
}