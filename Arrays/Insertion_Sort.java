import java.util.*;

public class Insertion_Sort {
    public static void insertionSort(int arr[],int n)
    {
        for(int i = 1;i<n;i++)
        {
            int cur = arr[i];
            int prev = i-1;
            while( prev >= 0 && arr[prev] > cur)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }  
            arr[prev+1] = cur;
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
        System.out.println();
        insertionSort(arr, n);
        System.out.println("Sorted Array : ");
        for(int i = 0;i<n;i++)
        {
             System.out.print(arr[i] + "  ");
        }
    }
    
}
