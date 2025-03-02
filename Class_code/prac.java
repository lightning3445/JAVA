import java.util.*;
class students
{
    static int roll_no;
    static String name;
}
class prac
{
    public static void main(String[] args)
    {
        System.out.println("Hi");
        prac p=new prac();
        p.details();
    }
    void details()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter roll_no:");
        students.roll_no=s.nextInt();
        System.out.println("Enter name:");
        students.name=s.nextLine();
    }
}