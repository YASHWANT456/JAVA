import java.util.*;

public class Pattern3
{
    public static void halfPyramid(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value of no. of rows : ");
        int n = sc.nextInt();
        halfPyramid(n);


    }
    
}
