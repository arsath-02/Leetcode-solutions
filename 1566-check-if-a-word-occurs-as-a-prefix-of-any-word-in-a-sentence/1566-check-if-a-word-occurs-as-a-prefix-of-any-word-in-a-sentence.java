class Solution {
    public int isPrefixOfWord(String sentence, String search) {
        String [] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(search))
            return i+1;
        }
        return -1;
    }
}