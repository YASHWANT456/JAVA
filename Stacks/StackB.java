import java.util.*;

public class StackB 
{
    static class Stack
    {
        static class Node
        {
            int data;
            Node next;
            public Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }
        public static Node head;
        public static boolean isEmpty()
        {
            return head == null;
        }
        public static void push(int data)
        {

            Node newNode = new Node(data);
            if( head == null)
            {
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop()
        {
            if( head == null)
            {
                return -1;
            }
            int ele = head.data;
            head = head.next;
            return ele;
        }
        public static int peek()
        {
            if( head == null)
            {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[])
    {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Element to be removed :  " + st.pop());
        System.out.println("Peek element : " + st.peek()) ;
    }
    
}
