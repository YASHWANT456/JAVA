import java.util.*;

public class Stock 
{
    public static int stockProblem(int arr[])
    {
        int n = arr.length;
        int profit = 0;
        int mini = arr[0];
        for(int i = 1;i<n;i++)
        {
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);
        }
        return profit;
    }
    public static void main(String[] args)
    {
        int arr[] = {7,1,5,3,6,4};
        int ans = stockProblem(arr);
        System.out.println("Maximum profit : " + ans);
    }
    
}
