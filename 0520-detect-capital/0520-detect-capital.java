class Solution {
    public boolean detectCapitalUse(String word) {
        int flag=0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            flag++;
        }
        return flag==word.length() || flag  == 0 || (flag ==1 && Character.isUpperCase(word.charAt(0)));
        
    }
}