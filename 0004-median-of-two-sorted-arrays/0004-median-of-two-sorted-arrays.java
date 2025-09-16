class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1,n2,n;
        n1=nums1.length;
        n2=nums2.length;
        
        int[] arr=new int[n1+n2];
       System.arraycopy(nums1,0,arr,0,n1);
       System.arraycopy(nums2,0,arr,n1,n2);
       Arrays.sort(arr);
       n=arr.length;
       if(n%2==0)
       {
           int a=n/2;
           int b=arr[a];
           int c=arr[a-1];
           double e = (double)(b+c) / 2;
           return e;
       }
       if(n%2==1)
       {
       int median = (n1+n2)/2;
       int d=arr[median];
       return d;
       }
    return 0;
    }

}