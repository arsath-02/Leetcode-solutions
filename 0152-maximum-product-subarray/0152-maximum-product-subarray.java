class Solution {
    public int maxProduct(int[] nums) {
        int n =nums.length;
        int max =nums[0];
        int min =nums[0];
        int result = max;
        

        for(int i=1;i<n;i++)
        {
            int curr=nums[i];
            int temp = Math.max(curr,Math.max(max*curr,min*curr));
            min =Math.min(curr,Math.min(max*curr,min*curr));

            max=temp;
            result=Math.max(max,result);
        }
        return result;
    }
}