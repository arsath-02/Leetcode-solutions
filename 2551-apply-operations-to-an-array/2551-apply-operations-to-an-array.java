class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                nums[i]=0;
                nums[i-1]*=2;
            }
            //System.out.print(nums[i]);
        }
        int i=0;
        int l=0;
        while(i<n){
            if(nums[i]!=0){
                swap(nums,i,l);
                l++;
            }
            i++;
        }
        return nums;

    }
    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}