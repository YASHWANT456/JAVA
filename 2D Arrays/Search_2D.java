import java.util.*;

public class Search_2D {
    public static boolean searchElement(int arr[][],int k)
    {
        int n = arr.length;
        int m = arr[0].length;
        int row = 0;
        int col = m-1;
        while( col >= 0 && row < n-1)
        {
            if( arr[row][col] == k)
            {
                return true;
            }
            if( arr[row][col] > k)
            {
                col--;
            }
            else if( arr[row][col] < k)
            {
                row++;

            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n  = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter elements of array : ");
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of target : ");
        int k = sc.nextInt();
        if(searchElement(arr, k))
        {
            System.out.println("Element is present ");
        }
        else
        {
            System.out.println("Element is not present");
        }


        
    }
    
}
