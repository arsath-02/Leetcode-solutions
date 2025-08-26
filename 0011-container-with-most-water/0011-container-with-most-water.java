class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0 ;
        int n =  height.length-1;

        // two pointer Approach

        // TC: O(n)
        // SC: O(1)
        while(l < n && r >= 0){
            int h1 = height[l];
            int h2 = height[r];

            int h = Math.min(h1,h2);

            int width = r - l;

            int area = h * width;

            max = Math.max(max,area);
            //System.out.println(area);
            if(h1<h2)
            l++;
            else
            r--;
        }
        return max;
    }
}