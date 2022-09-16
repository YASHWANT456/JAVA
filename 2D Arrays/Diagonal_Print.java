import java.util.*;

public class Diagonal_Print
{
    public static void printDiagonally(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;

        for(int k = 0;k<n;k++)
        {
            int i = k;
            int j = 0;
            while( i >= 0)
            {
                System.out.print(arr[i][j] + " ");
                i = i-1;
                j = j+1;
            }
            System.out.println();
        }
        
        for(int k = 1; k<= m-1;k++)
        {
            int i = n-1;
            int j = k;
            while( j <= n-1)
            {
                System.out.print(arr[i][j] + " ");
                i = i-1;
                j = j+1;
            }
            System.out.println();


        }
    }
    public static void main(String[] args)
    {
        
        int arr[][] = {{1,2,3},
               {4,5,6},
               {7,8,9}};

        printDiagonally(arr);

    }
    
}
