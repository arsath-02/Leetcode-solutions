class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
            max=Math.max(max,(i-map.get(s.charAt(i))-1));
            else
            map.put(s.charAt(i),i);
        }
        return max;
    }
}