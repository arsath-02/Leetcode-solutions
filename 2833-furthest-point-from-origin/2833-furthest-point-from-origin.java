class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int p1 = 0,p2 = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'L' || moves.charAt(i) == '_'){
                p1--;
            }
            else{
                p1++;
            }
        }
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'R' || moves.charAt(i) == '_'){
                p2++;
            }
            else{
                p2--;
            }
        }
        return Math.max(Math.abs(p1),Math.abs(p2));
    }
}