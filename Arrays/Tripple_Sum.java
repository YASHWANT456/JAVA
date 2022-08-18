import java.util.*;

public class Tripple_Sum {

    public static boolean threeSum(int arr[],int n,int t)
    {
        Arrays.sort(arr) ;
        boolean flag = false;
        for(int i = 0;i<n;i++)
        {
            int j = i+1;
            int k = n-1;
            while( j <= k)
            {
                int curSum = arr[i] + arr[j] + arr[k];
                if( curSum == t )
                {
                    flag = true;

                }
                if( curSum > t )
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return true;
         
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
        System.out.println("Enter target : ");
        int t = sc.nextInt();
        if(threeSum(arr, n, t))
        {
            System.out.println("Triplet Sum is present ");
        }
        else
        {
            System.out.println("Not present ");
        }
        
    }
    
}
