import java.util.*;

public class Subarrays 
{
    public static void printSubarray(int arr[])
    {
        int n = arr.length;
        int subarrayCount = 0;
        for( int i = 0; i<n;i++)
        {
            for(int j = i; j<n; j++)
            {
                for(int k = i; k<=j; k++)
                {
                    subarrayCount++;
                    System.out.print(arr[k] + " " );
                }
                System.out.println();
            }
        }
        System.out.print("Total no. of subarrays : " + subarrayCount);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        printSubarray(arr);

    }
}