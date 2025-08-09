class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer> map = new HashMap<>();
     int l =0, r=0;
     int n= s.length();
     int max=0;
     for(r =0 ;r<n;r++){
        char c =s.charAt(r);
        if(map.containsKey(c) && map.get(c)>=l)
        l = map.get(c)+1;

        map.put(c,r);
        max=Math.max(max,r-l+1);
     }    
     return max;
    }
}