class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet set = new HashSet<>();
        HashSet set1 = new HashSet<>();

        for(int i=0;i<=s.length()-10;i++)
        {
            if(!set.contains(s.substring(i,i+10)))
            {
                set.add(s.substring(i,i+10));
            }
            else{
                set1.add(s.substring(i,i+10));
            }
        }
        ArrayList<String> res= new ArrayList<>(set1);
        return res;
    }
}