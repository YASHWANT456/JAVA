import java.util.*;

public class Transpose2 
{
    public static void transposeMatrix(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        int arr1[][] = new int[m][n];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                arr1[j][i] = arr[i][j];
            }
        }
        System.out.println("Transposed matrix : ");
        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter elements of array : ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                arr[i][j] = sc.nextInt() ;
            }
        }
        transposeMatrix(arr);
        

    }
        

    
}
