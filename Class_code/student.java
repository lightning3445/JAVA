import java.util.*;
class Student
{
    static int roll_no;
    static String name;
}
class StaticKeyword
{
    public static void main(String[] args)
    {
        System.out.println("Hi");
        StaticKeyword s1=new StaticKeyword();
        s1.details();
    }
    void details()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        Student.name=s.nextLine();
        System.out.println("Enter rollno:");
        Student.roll_no=s.nextInt();
        System.out.println("Name"+Student.name+"roll_no"+Student.roll_no);
    }
}