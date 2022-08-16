import java.util.*;

public class Largest_Number
{
    public static int largestNumber(int arr[])
    {
        int n = arr.length;
        int maxNumber = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            if(maxNumber < arr[i])
            {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
    public static void main(String args[])
    {
        int arr[] = {1,8,5,4,9};
        int ans = largestNumber(arr);
        System.out.print("Largest number in array : " + ans);
        

    }
    
}
