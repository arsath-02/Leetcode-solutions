class Solution {
    public int[] findErrorNums(int[] nums) {
       int res[]=new int[2];
       int count []=new int[nums.length+1];

       for(int n:nums)
       {
        count[n]++;
       }
       for(int i=1;i<count.length;i++)
       {
        if(count[i]==2)
        res[0]=i;
       
       else if(count[i]==0)
       {
        res[1]=i;
       }
       }
       return res;
    }
}