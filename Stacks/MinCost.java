import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class MinCost 
{
    public static int minCost(String str)
    {
        if( str.length() % 2 != 0)
        {
            return -1;
        }
        Stack<Character>st = new Stack<>();
        int cost = 0;
        int a = 0;
        int b = 0;
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if( ch == '{')
            {
                st.push(ch);
            }
            else
            {
                if(!st.isEmpty() && st.peek() == '{')
                {
                    st.pop();

                }
                else 
                {
                    st.push(ch);

                }
            }

        }   
        while( !st.isEmpty())
        {
            if( st.peek() == '{')
            {
                a++;
            }
            else
            {
                b++;
            }
            st.pop();
        } 
        return (a+1)/2 + (b+1)/2;
}
    public static void main(String args[])
    {
        String str = "}}}{{{";
        System.out.println("Min cost for making expression valid : " +minCost(str) );
    }
    
}
