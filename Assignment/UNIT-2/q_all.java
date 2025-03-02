import java.util.*;
public class q_all 
{
    public static void main(String[] args)
    {
        PriorityQueue<String> p=new PriorityQueue<>();
        p.add("abc");    
        p.add("xyz");
        
        System.out.println(p);

        System.out.println(p.peek());

        System.out.println(p.poll());

        System.out.println(p.contains("abc"));
        System.out.println(p);

        p.clear();

    }
}
