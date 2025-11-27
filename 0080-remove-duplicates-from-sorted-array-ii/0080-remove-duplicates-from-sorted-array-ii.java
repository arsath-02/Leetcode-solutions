class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 2,r=2;
        int n = nums.length;
        if(n<=2) return n;
        while(r < n){
            if(nums[r] != nums[l-2]){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}