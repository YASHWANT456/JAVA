import java.util.*;

public class LinkedList 
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void printList()
    {
        Node temp = head;
        while( temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void addFirst(int data)
    {
        Node newNode = new Node(data);
        if( head == null)
        {
            head  = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public static void addLast(int data)
    {
        Node newNode = new Node(data);
        if( head == null)
        {
            head  = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public static int listSize()
    {
        int size = 0;
        Node temp = head;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        return size;
    }
    public static boolean listSearch(int target)
    {
        Node temp = head;
        while(temp != null)
        {
            if( temp.data )
        }
    }
    public static void main(String args[])
    {
        /*LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.printList();*/
        head = new Node(1);
        head.next = new Node(2);
        printList();
        addFirst(3);
        //addLast(4);
        printList();
        System.out.println(listSize());
    }
    
}
