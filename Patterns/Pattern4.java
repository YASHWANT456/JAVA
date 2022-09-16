import java.util.*;

public class Pattern4 
{
    public static void characterPattern(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            int count = n;
            for(int j = 1;j<=i;j++)
            {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of no. of rows : ");
        int n = sc.nextInt();
        characterPattern(n);

    }
    
}
