class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb =new StringBuilder();
        sb.append(s.charAt(0));
        int c=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==sb.charAt(sb.length()-1)){
                c++;
                if(c<3)
                sb.append(s.charAt(i));
            }
            else{
                c=1;
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}