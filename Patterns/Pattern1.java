import java.util.*;

public class Pattern1
{
    public static void starPattern(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  value of no. of rows : ");
        int n = sc.nextInt();
        starPattern(n);

    }
}