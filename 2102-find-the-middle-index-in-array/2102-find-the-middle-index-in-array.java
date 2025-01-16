class Solution {
    public int findMiddleIndex(int[] nums) {
        int n= nums.length;
        int sum=0;
        for(int i:nums)
        sum+=i;
        int s=0,p=0;
        //System.out.print(sum);
        for(int i=0;i<n;i++){
            
            s=sum-p;
            p=p+nums[i];
            if(s==p) return i;
        }
        return -1;
    }
}