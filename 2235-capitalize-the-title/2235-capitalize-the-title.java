class Solution {
    public String capitalizeTitle(String title) {
       String words[] = title.toLowerCase().split(" ");
       StringBuilder sb = new StringBuilder();

       for(String word:words)
       {
        if(word.length()>0)
        {
            if(word.length()>2)
            {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            }
            else{
                sb.append(word);
            }
            sb.append(' ');

        }

       }
       return sb.toString().trim();
    }
}