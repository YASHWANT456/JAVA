import java.util.*;

public class Linear_Search
{
    public static int linearSearch(int arr[],int key)
    {
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {1,5,8,9,10};
        int key = 9;
        int ans = linearSearch(arr, key);
        System.out.print("Index of key : " + ans);
    }
    
}
