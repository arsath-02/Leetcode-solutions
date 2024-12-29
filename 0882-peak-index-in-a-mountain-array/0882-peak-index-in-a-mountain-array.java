class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int res=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                res=i;
            }
        }
        return res;
    }
}