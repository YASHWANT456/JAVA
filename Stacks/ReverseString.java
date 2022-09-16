import java.util.*;

public class ReverseString 
{
    public static void reverseString(String str)
    {
        Stack<Character>st = new Stack<>();
        for(int i = 0;i<str.length();i++)
        {
            st.push(str.charAt(i));

        }
        while(!st.isEmpty())
        {
            System.out.print(st.pop());
        }
    }
    public static void main(String args[])
    {
        String str = "HELLO" ;
        System.out.println("Reversed String : ");
        reverseString(str);

    }
    
}
