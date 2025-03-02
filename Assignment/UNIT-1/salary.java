import java.util.*;
public class salary 
{
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        int hour=s.nextInt();
        System.out.println("Enter total hour:");
        int thour=s.nextInt();
        int gross_sal=hour*thour;
        System.out.println("Enter tax:");
        int tax=s.nextInt();
        int net_sal=gross_sal-tax;
        System.out.println(gross_sal);
        System.out.println(net_sal);
    }
}
