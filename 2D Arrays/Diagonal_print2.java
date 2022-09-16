
public class Diagonal_print2 
{
    public static void printDiagonally(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;
        /* 
        for(int k = 0;k<m-1;k++)
        {
            int i = 0;
            int j = k;
            while( j >= 0)
            {
                System.out.print(arr[i][j] + " ");
                i = i+1;
                j = j-1;
            }
            System.out.println();
        }*/
        
        for(int k = 0; k<= n-1;k++)
        {
            int i = 0;
            int j = k;
            while( j>=0)
            {
                System.out.print(arr[i][j] + " ");
                i = i+1;
                j = j-1;
            }
            System.out.println();


        }
        for(int k = 1; k<= m-1;k++)
        {
            int i = k;
            int j = n-1;
            while( i <= n-1)
            {
                System.out.print(arr[i][j] + " ");
                i = i+1;
                j = j-1;
            }
            System.out.println();


        }
    }
    public static void main(String[] args)
    {
        
        int arr[][] = {{1,2,3},
               {4,5,6},
               {7,8,9}};

        printDiagonally(arr);

    }
    
}
