class Solution {
    public int compress(char[] chars) {
        int res = 0;
        int i = 0;
        while(i<chars.length){
            int group =1;
            while(i+group < chars.length && chars[i] == chars[i + group]){
                group++;
            }
            chars[res++] = chars[i];
            if(group>1){
                for(char j:Integer.toString(group).toCharArray()){
                    chars[res++] = j;
                }
            }
            i+=group;
        }
        return res;
    }
}