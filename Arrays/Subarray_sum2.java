import java.util.*;

public class Subarray_sum2 
{
    public static int maxSubarraySum(int arr[])
    {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1;i<n;i++)
        {
            prefix[i] = arr[i] + prefix[i-1];
        }
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                int curSum = 0;
                if( i != 0)
                {
                    curSum  = prefix[j] - prefix[i-1];
                }
                else
                {
                    curSum = prefix[j];
                }
                maxSum = Math.max(maxSum,curSum);
            }
        }
        return maxSum;


    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int ans = maxSubarraySum(arr);
        System.out.println("Maximun subarray sum : " + ans);
    }
    
}
