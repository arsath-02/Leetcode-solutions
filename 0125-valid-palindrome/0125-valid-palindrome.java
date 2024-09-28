class Solution {
    public boolean isPalindrome(String s) {
     String ans=s.toLowerCase().replaceAll("[^a-z0-9]", "");
     int l=0,r=ans.length()-1;
     while(l<r){
        if(ans.charAt(l)!=ans.charAt(r)){
        return false;
        }
        l++;
        r--;
     }
    return true;
    }
}