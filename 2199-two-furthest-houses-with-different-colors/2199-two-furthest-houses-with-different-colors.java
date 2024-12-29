class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int l=0;
        int r=n-1;
        int ans=0;
        while(colors[l]==colors[r]){
            l++;
        }
        ans=Math.max(ans,(n-1-l));
        while(colors[r]==colors[0]){
            r--;
        }
        ans=Math.max(ans,(r-0));
        return ans;
    }
}