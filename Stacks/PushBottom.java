import java.util.*;

public class PushBottom 
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
    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        insertAtBottom(st, 0);
        System.out.println("Modified stack : ");
        while(!st.isEmpty())
        {
            System.out.print(st.pop() + " ");

        }


    }
    
}
