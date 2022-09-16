import java.util.*;
public class Input 
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        int cnt = 0;
        while(true)
        {
            int n = sc.nextInt();
            list.add(n);
            if( list.get(i) < 0)
            {
                break;
            }
            cnt++;

        }
        int count = 0;
        for(int j = 0; j<list.size();j++)
        {
            if( list.get(j) % 6 == 0)
            {
                count++;
            }
        }
        System.out.print(count);


    }
    
}
