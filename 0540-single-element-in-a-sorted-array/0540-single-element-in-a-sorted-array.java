class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int mid = n/2,itr=mid+1;
        int start =0,res =nums[mid];
        if(n==1)
        {
            return nums[0];
        }
        while(start<mid && itr<n)
        {
            res^=nums[start++];
            res^=nums[itr++];
        }
        return res;
    }
}