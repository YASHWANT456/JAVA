import java.util.*;

public class ReverseStack 
{
    public static void insertAtBottom(Stack<Integer>st , int data)
    {
        if( st.isEmpty())
        {
            st.push(data) ;
            return ;
        }
        int ele = st.pop();
        insertAtBottom(st, data);
        st.push(ele);

    }
    public static void reverse(Stack<Integer> st)
    {
        if( st.isEmpty())
        {
            return ;

        }
        int ele = st.pop();
        reverse(st);
        insertAtBottom(st, ele);
    }
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse(st);
        while(!st.isEmpty())
        {
            System.out.print(st.pop() + " ");
        }
    }
    
}
