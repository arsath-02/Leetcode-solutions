class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int maxfreq[]= new int [26];
        List<String> ans = new ArrayList<>();
        for(String s:words2){
            int freq[] = new int [26];
            for(char ch:s.toCharArray()){
                freq[ch -'a']++;
            }
            for(int i=0;i<26;i++){
                maxfreq[i]=Math.max(maxfreq[i],freq[i]);
            }
        }
        for(String s:words1){
            int freq[] = new int[26];
            for(char ch:s.toCharArray()){
                freq[ch - 'a']++;
            }
            boolean issubset=true;
            for(int i=0;i<26;i++){
                if(freq[i]<maxfreq[i]){
                    issubset=false;
                    break;
                }
            }
            if(issubset){
                ans.add(s);
            }
        }
        return ans; 
    }
}