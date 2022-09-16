import java.util.*;

public class ValidParenthesis 
{
    public static boolean isValid(String s)
    {
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if( ch == '[' || ch == '{' || ch == '(')
            {
                st.push(ch);
            }
            else if ( ch == ']')
            {
                if(!st.isEmpty() && st.peek() == '[')
                {
                    st.pop();
                }
                else
                {
                    break;
                }
            }
            else if ( ch == '}')
            {
                if(!st.isEmpty() && st.peek() == '{')
                {
                    st.pop();
                }
                else
                {
                    break;
                }
            }
            else if ( ch == ')')
            {
                if(!st.isEmpty() && st.peek() == '(')
                {
                    st.pop();
                }
                else
                {
                    break;
                }
            }
        }
        if( st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        String s = "[{()})}]";
        if(isValid(s))
        {
            System.out.println("Expression is valid");
        }
        else
        {
            System.out.println("Expression is not valid");

        }
    }
    
}
