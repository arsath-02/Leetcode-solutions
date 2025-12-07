class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum+= i;
        }
        if(sum %2 ==1) return 0;
        int n = nums.length;
        int pref = 0;
        int count=0;
        for(int i=0;i<n-1;i++){
            pref += nums[i];
            int diff = 2 * pref - sum;
            if(diff % 2 == 0) 
            count++;
        }
        return count;
    }
}