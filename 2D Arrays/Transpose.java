import java.util.*;
public class Transpose {
    public static void transposeMatrix(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0;i<n;i++)
        {
            for(int j = i;j<m;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

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
        transposeMatrix(arr);
        System.out.println("matrix after transpose ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    
}
