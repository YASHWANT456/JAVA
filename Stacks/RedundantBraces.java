import java.util.*;

public class RedundantBraces 
{
    public static boolean redundantBraces(String str)
    {
        Stack<Character>st = new Stack<>();
        boolean flag = false;
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if( ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                st.push(ch);
            }
            else if( ch == ')')
            {
                if(st.peek() == '(')
                {
                    flag = true;
                }
                while( st.peek() == '+' || st.peek() == '-' || st.peek() == '*' || st.peek() == '/')
                {
                    
                    st.pop();

                }
                st.pop();
            }
        }
        if( flag == true)
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
        String str = "((a+b)+(c+d))";
        if(redundantBraces(str))
        {
            System.out.println("Redundant Braces");
        }
        else
        {
            System.out.println("Not");
        }
    }
    
}
