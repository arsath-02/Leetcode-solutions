class Solution {
    public int numberOfSpecialChars(String word) {
        int cap[] = new int [26];
        int sm[] = new int [26];
        for(int i=0;i<word.length();i++)
        {
            char s =word.charAt(i);
            if(s>='a' && s<='z') sm[s-'a']++;
            else cap[s-'A']++;
        }
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(cap[i]>0 && sm[i]>0)
            count++;
        }
        return count;
    }
}