class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0) return 0;
        int l[]= new int[n];
        int r[]=new int[n];
        int max=0;
        l[0]=height[0];
        for(int i=1;i<n;i++)
        {
            l[i]=Math.max(l[i-1],height[i]);
        }
        r[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            r[i]=Math.max(r[i+1],height[i]);
        }
        for(int i=0;i<n;i++)
        {
            max+=Math.min(l[i],r[i])-height[i];
        }
        return max;
    }
}