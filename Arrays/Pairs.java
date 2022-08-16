import java.util.*;

public class Pairs
{
    public static void allPossiblePairs(int arr[])
    {
        int n = arr.length;
        int pairCount = 0;
        for(int i = 0; i<n; i++)
        {
             for(int j = i+1;j<n;j++)
             {
                pairCount++;
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
             }

        }
        System.out.print("Total no. of pairs : " + pairCount);

    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        allPossiblePairs(arr);

    }

}