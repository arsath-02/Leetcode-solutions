class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> st = new HashSet<>();
        int c=0;
        for(String bw:bannedWords){
            st.add(bw);
        }

        for(String ms:message){
            if(st.contains(ms))
            c++;
            if(c>=2)
            return true;
        }
    return false;
    }
}