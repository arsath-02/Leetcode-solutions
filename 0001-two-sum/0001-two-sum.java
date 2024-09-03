class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
       int i,j,n,i1,i2;
       n=nums.length;
       int sa[]=new int[2];
       for(i=0;i<n;i++)
       {
           for(j=i+1;j<n;j++)
           {
               if(nums[i]+nums[j]==target)
               {
                   sa[0]=i;
                   sa[1]=j;
            
               }
           }
       }
       
       return sa;
    }
}