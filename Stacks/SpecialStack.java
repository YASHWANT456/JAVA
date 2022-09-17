import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class SpecialStack 
{
    static class Stackb
    {
        static Stack<Integer>st = new Stack<>();
        static int mini = Integer.MAX_VALUE;
        public static  void push(int data)
        {
            if( st.isEmpty())
            {
                st.push(data);
                mini = data;
            }
            else
            {
                if( data > mini )
                {
                    st.push(data);
                }
                else
                {
                    st.push(2*data - mini);
                    mini = data;

                }
            }

        }
        public static void pop()
        {
            if( st.isEmpty())
            {
                return ;
            }
            else
            {
                int ele = st.peek();
                st.pop();
                if(ele > mini )
                {
                   
                    st.pop();

                }
                else
                {
                    mini = 2*mini - ele;
                  
                    st.pop();
                }
            }
        }
            public static int Top()
            {
        
                if( st.isEmpty())
                {
                    return -1;
                }
                else
                {
                    int ele = st.peek();
                    if(ele > mini )
                    {
                        return ele;
                    }
                    else
                    {
                        return mini;
                    }
                }
            }
            public static int getMini()
            {
                if( st.isEmpty())
                {
                    return -1;
                }
                else 
                {
                    return mini;
                }

            }
        

    }
    public static void main(String args[])
    {
        Stackb st = new Stackb();
        st.push(1);
        st.push(2);
        st.push(5);
        st.push(0);
        System.out.println(st.getMini());
        st.pop();
        System.out.println(st.getMini());

    }
    
}
