class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        if(s.length()<=1)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(!st.isEmpty() && st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)==']')
            {
                if(!st.isEmpty() && st.peek()=='[')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(!st.isEmpty() && st.peek()=='{')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(st.size()==0)
        {
            return true;
        }
        return false;
    }
}