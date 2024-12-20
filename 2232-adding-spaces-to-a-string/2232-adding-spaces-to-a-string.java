class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder(s);
        int i=0;
        for(int n:spaces)
        {
            str.insert(n+i," ");
            i++;
        }
        return str.toString();
    }
}