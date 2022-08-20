import java.util.*;

public class Rotated_Search {
    public static int rotatedSearch(int arr[],int key)
    {
        int s = 0;
        int e = arr.length-1;
        while( s <= e)
        {
            int mid = (s+e)/2;
            if( arr[mid] == key)
            {
                return mid;
            }
            if( arr[mid] > arr[s])
            {
                if( key >= arr[s] && key < arr[mid])
                {
                    e = mid -1;
                }
                else
                {
                    s = mid +1;
                }
                

            }
            else
            {
                if( key > arr[mid] && key <= arr[e])
                {
                    s = mid +1;
                }
                else
                {
                    e = mid-1;
                }

            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {3,4,5,1,2};
        int key = 2;
        int ans = rotatedSearch(arr, key);
        System.out.print("Index of key : " + ans);


    }
    
}
