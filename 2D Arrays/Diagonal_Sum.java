import java.util.*;

public class Diagonal_Sum
{
    public static int diagonalSum(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if( i == j)
                {
                    sum += arr[i][j];
                }
                else if( (i + j) == n-1)
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
        int ans = diagonalSum(arr);
        System.out.println("Diagonal Sum : " + ans);
        

    }
}