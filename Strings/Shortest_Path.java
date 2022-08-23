import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Shortest_Path
{
    public static float findPath(String str)
    {
        float x = 0;
        float y = 0;
        for(int i = 0;i<str.length();i++)
        {
            char temp = str.charAt(i);
            if( temp == 'E')
            {
                x++;
            }
            else if( temp == 'N')
            {
                y++;
            }
            else if( temp == 'W')
            {
                x--;
            }
            else 
            {
                y--;
            }

        }
        float x1 = x*x;
        float y1 = y*y;
        return (float) Math.sqrt(x1 + y1) ;
    }
    public static void main(String args[])
    {
        System.out.print("Shortest Path : " +  findPath("WNEENESENNWNNN"));

    }
}