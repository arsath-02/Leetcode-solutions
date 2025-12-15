class Solution {
    public String convert(String s, int numRows) {
        
        int n = s.length();

        if(n==1)
        return s;

        StringBuilder[] sb = new StringBuilder[numRows];

        for(int i=0 ;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        int i=0;
        while(i<n){
            for(int j=0;j<numRows && i<n;j++){
                sb[j].append(s.charAt(i++));
            }
            for(int j=numRows-2;j>0 && i<n;j--){
                sb[j].append(s.charAt(i++));
            }
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder st:sb){
            res.append(st);
        }
        return res.toString();
    }
}