import java.util.*;
public class prime
{
    void p()
    {
        int b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        b=s.nextInt();
        if(b%2!=0 || b==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
    public static void main(String[] args)
    {
        prime pr=new prime();
        pr.p();

    }
}