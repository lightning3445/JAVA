import java.util.Scanner;

public class student
{
    String name;
    int roll_no;
    int marks[];
    int avg;
    int sum=0;

    student(String n,int r,int m[])
    {
        name=n;
        roll_no=r;
        marks=m;
    }
    void calculateavg()
    {
        for (int i=0;i<5;i++)
        {
            sum+=marks[i];
        }
        avg=sum/5;
    }
    void display()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        name=s.nextLine();
        System.out.println(name);
        System.out.println("Enter roll_no:");
        roll_no=s.nextInt();
        System.out.println(roll_no);
        System.out.println(avg);
    }
    public static void main(String arg[])
    {
        int arr[]={10,20,30,40,50};
        student su=new student("dhruv",28,arr);
        su.calculateavg();
        su.display();
    }
}
