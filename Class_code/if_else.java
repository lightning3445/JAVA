import java.util.Scanner;
public class if_else 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=s.nextInt();
        System.out.println("Enter b:");
        int b=s.nextInt();

        if(a>b)
        {
            System.out.println("A is greater");
        }
        else
        {
            System.out.println("B is greater");
        }
    }
}
