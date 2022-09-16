import java.util.*;

public class PrevSmaller 
{
    public static void prevSmaller(int arr[],int ans[])
    {
        int n = arr.length;
        Stack<Integer>st = new Stack<>();
        for(int i = 0; i< n; i++)
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
        prevSmaller(arr, ans);
        System.out.println("Previous smaller  : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(ans[i] + " ");
        }


    }
    
}
