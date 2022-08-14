import java.util.*;

public class Pattern5 
{
    public static void hollowRectangle(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if( i == 1 || i == n || j == 1 || j == n )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of no. of rows : ");
        int n = sc.nextInt();
        hollowRectangle(n);

    }
    
}
