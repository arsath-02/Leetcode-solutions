class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        return "";

        int lengcd=gcd(str1.length(),str2.length());
        return str1.substring(0,lengcd);
    }
    public int gcd(int s1,int s2){
        while(s2!=0){
            int temp=s1%s2;
            s1=s2;
            s2=temp;
        }
        return s1;
    }
}