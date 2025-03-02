import java.util.*;
public class queue 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        pq.add(10);
        pq.add(8);
        pq.add(30);
        pq.add(5);
        pq.add(56);
        pq.add(71);
        pq.add(59);
        pq.add(25);
        pq.add(69);

        System.out.println(pq);
    }    
}
