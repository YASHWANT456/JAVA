import java.util.*;

public class Pattern6 
{
    public static void rotated_halfPyramid(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j <= n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of no. of rows : ");
        int n = sc.nextInt();
        rotated_halfPyramid(n);;

    }
    
}
