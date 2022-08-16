import java.util.*;

public class Kadanes 
{
    public static int maxSubarraySum(int arr[])
    {
        int n = arr.length;
        int curSum = 0;
        int maxSum = 0;
        for(int i = 0; i<n; i++)
        {
            curSum += arr[i];
            maxSum = Math.max(maxSum, curSum);
            if( maxSum < 0)
            {
                curSum = 0;
            }

        }
        return maxSum ;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int ans = maxSubarraySum(arr);
        System.out.print("Maximun subarray sum : " + ans);


    }
    
}
