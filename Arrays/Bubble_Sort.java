import java.util.*;

public class Bubble_Sort {
    public static void bubbleSort(int arr[],int n)
    {
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-1-i;j++)
            {
                if( arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubbleSort(arr, n);
        System.out.println("Sorted Array : ");
        for(int i = 0;i<n;i++)
        {
             System.out.print(arr[i] + "  ");
        }
    }

}
