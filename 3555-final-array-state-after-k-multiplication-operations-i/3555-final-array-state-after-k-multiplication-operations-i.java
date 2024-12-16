class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        
        int minin=0;
        while(k>0){
            int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            
            if(nums[i]<min)
            {
                min=nums[i];
                minin=i;
            }
        }
        nums[minin]*=multiplier;
        k--;
        minin=0;
        }
        return nums;
    }
}