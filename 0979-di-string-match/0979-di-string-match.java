class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int ans[]=new int[n+1];
    int l=0,r=n;
        for(int i=0;i<n;++i){
            ans[i] = s.charAt(i) == 'I' ? l++ : r--;
               
            }
             ans[n]=l;
        return ans;
    }
}