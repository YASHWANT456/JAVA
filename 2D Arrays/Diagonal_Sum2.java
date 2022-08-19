import java.util.*;
public class Diagonal_Sum2 {
    public static int diagonalSum2(int arr[][])
    {
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum += arr[i][i];
            if( i  != n-i-i)
            {
                sum += arr[i][n-i-1];
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
        int ans = diagonalSum2(arr);
        System.out.println("Diagonal Sum : " + ans);
        

    }
    
}
