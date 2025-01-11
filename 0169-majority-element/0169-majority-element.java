class Solution {
    public int majorityElement(int[] nums) {
    int count=0;
    Integer ans=null;
    for(int i:nums)
    {
        if(count==0)
        ans=i;
    count+=i == ans ?1:-1;
    }
    return ans;

    }
}