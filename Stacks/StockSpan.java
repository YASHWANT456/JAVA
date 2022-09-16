import java.util.*;

public class StockSpan
{
    public static void stockSpan(int arr[],int span[])
    {
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        span[0] = 1;
        st.push(0);
        for(int i = 1;i<n;i++)
        {
            while( !st.isEmpty() && arr[i] > arr[st.peek()])
            {
                st.pop();
            }
            if( st.isEmpty())
            {
                span[i] = i+1;
            }
            else
            {
                span[i] = i - st.peek();
            }
            st.push(i);
        }

    }
    public static void main(String args[])
    {
        int arr[] = {100,80,60,70,60,85,100};
        int n = arr.length;
        int span[] = new int[n];
        stockSpan(arr, span);
        System.out.println("Span of stock : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(span[i] + " ") ;
        }

    }
}