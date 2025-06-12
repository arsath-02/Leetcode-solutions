class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn){
                    if(m<10){
                        ans.add(String.format("%d:0%d",h,m));

                    }
                    else
                     ans.add(String.format("%d:%d",h,m));
                }
            }
        }
        return ans;
    }
}