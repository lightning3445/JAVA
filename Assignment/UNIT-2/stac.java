import java.util.*;
public class stac 
{
    int min(Stack<Integer> st)
    {
        int m=Integer.MAX_VALUE;

        for(int i:st)
        {
            if(i<m)
            {
                m=i;
            }
        }
        return m;
    }
    public static void main(String[] args)
    {
        Stack<Integer> stk=new Stack<>();
        stac s=new stac();
        
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(5);
        stk.push(8);

        int m=s.min(stk);
        System.out.println(m);
    }
}
