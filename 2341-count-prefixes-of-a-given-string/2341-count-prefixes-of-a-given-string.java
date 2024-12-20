class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(String w:words){
            if(s.startsWith(w))
            c++;
        }
        return c;
    }
}