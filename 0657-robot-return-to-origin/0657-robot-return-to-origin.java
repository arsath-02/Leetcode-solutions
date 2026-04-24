class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int l=0,r=0,u=0,d=0;
        for(char i : moves.toCharArray()){
            if(i == 'L') l++;
            if(i == 'R') r++;
            if(i == 'U') u++;
            if(i == 'D') d++;
        }
        if(l == r && u == d)
            return true;
        return false;
    }
}