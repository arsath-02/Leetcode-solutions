class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0,r = n-1;
        int max =0;
        while(l<r){
            int h1 = height[l];
            int h2 = height[r];

            int min = Math.min(h1,h2);

            int width = r - l;

            int area  = min * width;
            max = Math.max(max , area);
            if(h1 < h2) l++;
            else r--;
        }
        return max;
    }
}