import java.util.*;

public class Reverse_Array 
{
    public static void reverseArray(int arr[])
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while( i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        System.out.println("Original Array : ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        reverseArray(arr);
        System.out.println("Reversed Array : ");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");

        }

    }
    
}
