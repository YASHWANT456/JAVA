import java.util.*;

public class Rainwater 
{
    public static int rainwaterTrapped(int arr[])
    {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i = 1;i<n;i++)
        {
            left[i] = Math.max(left[i-1],arr[i]);
        }
        for(int i = n-2;i>=0;i--)
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int ans = 0;
        for(int i = 0;i<n;i++)
        {
            ans += Math.min(left[i],right[i]) - arr[i];
        }
        return ans;
    }
    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4 };
        int ans = rainwaterTrapped(arr);
        System.out.print("Amount of rainwater trapped : " + ans);

    }
    
}
