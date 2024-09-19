class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk =new Stack<>();
        for(char k:s.toCharArray())
        {
            if(k=='(')
                stk.push(')');
            else if(k=='[')
                stk.push(']');
            else if(k=='{')
                stk.push('}');
            else if(stk.isEmpty() ||stk.pop()!=k)
            return false;
        }
        
        
        return stk.isEmpty();
    }
}