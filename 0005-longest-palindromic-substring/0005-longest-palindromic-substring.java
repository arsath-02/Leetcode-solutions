class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        
        int st =0;
        int max = 1;
        for(int i=0; i<n-1;i++){
            dp[i][i] = true;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1] = true;
                st = i;
                max = 2;
            }
        }

        for(int len = 3;len<=n;len++){
            for(int i=0;i<=n -len ;i++){
                int j = i+len-1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    if(len>max){
                        st = i;
                        max = len;
                    }
                }
            }
        }
        return s.substring(st,max+st);
    }
}