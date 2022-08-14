import java.util.*;

public class Pattern8 
{
    public static void floydTriangle(int n)
    {
        int cnt = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(cnt + " ");
                cnt++;

            }
            System.out.println();
        }

    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of no. of rows : ");
        int n = sc.nextInt();
        floydTriangle(n);

    }
    
}
