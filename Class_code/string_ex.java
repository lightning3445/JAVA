import java.util.*;
public class string_ex
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a name:");
        String name=s.nextLine();

        System.out.println("upper="+name.toUpperCase());
        System.out.println("lower="+name.toLowerCase());
        //Removing Unwanted Space
        System.out.println(name.trim());
        //Length of using after trim
        System.out.println((name.trim()).length());
        if(name.equals("Dhruv"))
        {
            System.out.println("Dashboard open");
        }
    }

}
