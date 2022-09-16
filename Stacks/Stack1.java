import java.util.*;

public class Stack1 
{
    static class Stack2
    {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size() == 0;
        }
        public static  void push(int data)
        {
            list.add(data);
        }
        public static int pop()
        {
            if( list.size() == 0)
            {
                return -1;
            }
            int ele = list.get(list.size()- 1);
            list.remove(list.size()-1);
            return ele;

        }
        public static int peek()
        {
            if( list.size() == 0)
            {
                return -1;
            }
            int ele = list.get(list.size()- 1);
            return ele;
        }

    }
    public static void main(String args[])
    {
        Stack2 st = new Stack2();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Element to be removed :  " + st.pop());
        System.out.println("Peek element : " + st.peek()) ;
    }

    
}
