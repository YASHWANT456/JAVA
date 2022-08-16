import java.util.*;

public class Subarray_sum1 
{
    public static  int maxSubarraySum(int arr[])
    {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
           
            for(int j = i;j<n;j++)
            {
                int curSum = 0;
                for(int k = i; k<=j; k++)
                {
                    curSum += arr[k];
                    if( maxSum < curSum)
                    {
                        maxSum = curSum;
                    }
                }
            }
        }
        return maxSum;

    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int ans = maxSubarraySum(arr);
        System.out.print("Maximum subarray sum : " + ans);


    }
    
}