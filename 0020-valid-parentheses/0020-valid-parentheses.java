import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
      /*  if (s.length() % 2 != 0)
            return false;*/

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && st.isEmpty())
                return false;
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));

            else {
              // if (st.size() != 0) {
                    if (s.charAt(i) == ')' && st.peek() == '(')
                        st.pop();
                    else if (s.charAt(i) == '}' && st.peek() == '{')
                        st.pop();
                    else if (s.charAt(i) == ']' && st.peek() == '[')
                        st.pop();
                 else {
                    st.push(s.charAt(i));
                }
            }
        }
        if (st.empty())
            return true;
        return false;
    }
}