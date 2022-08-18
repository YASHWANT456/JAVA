import java.util.*;

public class Selection_Sort {
    public static void selectionSort(int arr[],int n)
    {
        for(int i = 0;i<n-1;i++)
        {
            int mini = i;
            for(int j = i+1;j<n;j++)
            {
                if(arr[mini] > arr[j])
                {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
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
        selectionSort(arr, n);
        System.out.println("Sorted Array : ");
        for(int i = 0;i<n;i++)
        {
             System.out.print(arr[i] + "  ");
        }
    }
    
}
