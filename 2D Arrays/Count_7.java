import java.util.*;

public class Count_7 
{
    public static int countSeven(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(arr[i][j] == 7)
                {
                    count++;
                }
            }
        }
        return count;
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
        int ans = countSeven(arr);
        System.out.println("count of 7 in matrix  : " + ans);
        

    }
    
}
