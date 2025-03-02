import java.util.*;
public class temp
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter fahrenheit:");
        int f=s.nextInt();
        double c=(f-32)/1.8;
        System.out.println(c);
    }
}
