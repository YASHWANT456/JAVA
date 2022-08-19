import java.util.*;

public class K_Row_Sum 
{
    public static int rowSum(int arr[][],int k)
    {
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            if(i == k-1)
            {
                for(int j = 0;j<m;j++)
                {
                    sum += arr[i][j];

                }
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter elements of array : ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = sc.nextInt() ;
            }
        }
        System.out.println("Enter value of k : ");
        int k = sc.nextInt();
        int ans = rowSum(arr, k);
        System.out.println("Row Sum : " + ans);
        

    }
    
}
