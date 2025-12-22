class Solution {
    // public boolean ispalin(String s,int l,int r){
        
    // }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = s.length();
        int l =0;
        int r = n-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}