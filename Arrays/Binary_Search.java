import java.util.*;

public class Binary_Search 
{
    public  static int binarySearch(int arr[],int key)
    {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while( start <= end)
        {
            int mid = start + (end - start)/2;
            if( arr[mid] == key)
            {
                return mid ;
            }
            if( arr[mid] > key)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1 ;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int key = 4;
        int ans = binarySearch(arr, key);
        System.out.print("Index of key : " + ans);


    }
}
