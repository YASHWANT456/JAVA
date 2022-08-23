import java.util.*;

public class Anagram_String {
    public static boolean anagramString(String str1,String str2)
    {
        boolean flag = false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if( str1.length() == str2.length())
        {
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result = Arrays.equals(ch1, ch2);
            if(result)
            {
                flag = true;
            }
            else
            {
                flag = false;
            }

        }
        else
        {
            flag = false;
        }
        return flag;
    }

    public static void main(String args[])
    {
        if(anagramString("race", "care"))
        {
            System.out.println("Anagram String");
        }
        else
        {
            System.out.println("Not Anagram String");
        }

    }
    
}
