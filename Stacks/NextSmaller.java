import java.util.*;

public class NextSmaller 
{
    public static void nextSmaller(int arr[],int ans[])
    {
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            while( !st.isEmpty() && arr[i] <= arr[st.peek()])
            {
                st.pop();
            }
            if( st.isEmpty())
            {
                ans[i] = -1;
            }
            else
            {
                ans[i] = arr[st.peek()];
            }
            st.push(i);
        }

    }
    public static void main(String args[])
    {
        int arr[] =  {6,8,0,1,3};
        int n = arr.length;
        int ans[] = new int[n];
        nextSmaller(arr, ans);
        System.out.println("Next smaller  : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(ans[i] + " ");
        }


    }
    
}
