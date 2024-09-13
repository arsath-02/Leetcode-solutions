class Solution {
    public int totalHammingDistance(int[] nums) {
     int tot=0;
     int n=nums.length;
     for(int i=0;i<31;i++)
     {
        int ones=0;
        for(int k:nums)
        {
            ones+=(k>>i)&1;
        }
        tot+=ones*(n-ones);
     }  
     return tot;
    }
}