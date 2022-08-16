import java.util.*;

public class Demo 
{
    public static void updateArray(int arr[])
    {
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            arr[i] = arr[i]+2;
        }
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
        System.out.println("Elements of array are : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        updateArray(arr);
        System.out.println("Updated Array : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
    
}
