class Solution {
    // public boolean ispalin(String s,int l,int r){
        
    // }
    public boolean isPalindrome(String s) {
        int n = s.length();
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String str = new StringBuilder(s).reverse().toString();
        return s.equals(str);
    }
}