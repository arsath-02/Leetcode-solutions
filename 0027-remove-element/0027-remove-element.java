class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i=0,l=0;
        while(i<n){
            if(nums[i]!=val){
                swap(nums,i,l);
                l++;
            }
            i++;
        }
        return l       ;
    }
    public void swap(int []nums,int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}