import java.util.*;
public class Print_Spiral {
    public static void spiralPrint(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        while( top <= bottom && left <= right)
        {
            for(int i = left ; i<= right;i++)
            {
                System.out.print(arr[top][i]+ " ");
            }
            top++;
            for(int i = top;i<=bottom;i++)
            {
                System.out.print(arr[i][right] + " ");

            }
            right--;
            for(int i = right;i>= left;i--)
            {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
            for(int i = bottom;i>=top;i--)
            {
                System.out.print(arr[i][left]+ " ");
            }
            left++;

        }
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
        System.out.println("Spiral Order : ");
        spiralPrint(arr);      

        
    }
    
}
