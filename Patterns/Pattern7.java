import java.util.*;

public class Pattern7
{
    public static void inverted_halfPyramid(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1; j<=n-i+1; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of no. of rows : ");
        int n = sc.nextInt();
        inverted_halfPyramid(n);

    }
    
}
