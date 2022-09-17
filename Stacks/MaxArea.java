import java.util.*;

public class MaxArea 
{
    public static int maxArea(int arr[])
    {
        int n = arr.length;
        int ns[] = new int[n];
        int ps[] = new int[n];
        int ans = 0;
        Stack<Integer>st = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            while( !st.isEmpty() && arr[i] <= arr[st.peek()])
            {
                st.pop();
            }
            if( st.isEmpty())
            {
                ns[i] = n;
            }
            else
            {
                ns[i] = st.peek();
            }
            st.push(i);
        }
        st = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            while( !st.isEmpty() && arr[i] <= arr[st.peek()])
            {
                st.pop ();
            }
            if( st.isEmpty())
            {
                ps[i] = -1;
            }
            else
            {
                ps[i] = st.peek();
            }
            st.push(i);
        }
        for(int i = 0;i<n;i++)
        {
            int l = arr[i];
            int b = ns[i] - ps[i] -1;
            int area = l*b;
            ans = Math.max(ans,area);
        }
        return ans;

    }
    public static void main(String args[])
    {
        int arr[] = {2,1,5,6,2,3};
        System.out.println("Max area under histogram : " + maxArea(arr));
    }
    
}
