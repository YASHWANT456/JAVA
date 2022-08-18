import java.util.*;

public class Pair_sum {
    public static boolean twoSum(int arr[],int n,int k)
    {
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        boolean flag = false;
        while( i <= j)
        {
            int curSum = arr[i] + arr[j];
            if(curSum == k)
            {
                flag = true;
            }
            if( curSum > k)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return flag;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k : ");
        int k = sc.nextInt();

        if(twoSum(arr, n, k))
        {
            System.out.println("Pairs are present");
        }
        else
        {
            System.out.println("Pairs are not present");


        }
    }
    
}
