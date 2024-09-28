class Solution {
    public boolean validPalindrome(String s) {
        int r=s.length()-1,l=0;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
                return ispalin(s,l+1,r)||ispalin(s,l,r-1);
            l++;
            r--;
        }
        return true;
    }
    public boolean ispalin(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
            return false;
            l++;
            r--;
        }
        return true;
    }
}