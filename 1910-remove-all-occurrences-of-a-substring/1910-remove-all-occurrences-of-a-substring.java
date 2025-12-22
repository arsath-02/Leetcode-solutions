class Solution {
    public String removeOccurrences(String s, String part) {
        char sarr[] = s.toCharArray();
        char target[] = part.toCharArray();
        int n = s.length();
        char res[] = new char[n];
        int n1 = part.length();
        int stsize = 0;
        char end = target[n1-1];

        for(char curr:sarr){
            res[stsize++] = curr;

            if(curr == end && stsize >= n1){
                int i = stsize-1;
                int j = n1-1;

                while(j>=0 && res[i] == target[j]){
                    j--;
                    i--;
                }
                if(j<0){
                    stsize = i +1;
                }
            }

        }
        return new String(res,0,stsize);
    }

}