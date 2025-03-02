// 1) wap to create class student with instance var id and name static variable event id with a default value of 0
// a constructor to initialize instance var and a method display details to print all the details in the main class 
// create 2 student objects with diff details and use the display details method to show their info.
import java.util.*;
class student
{
    int id;
    String name;
    static int event_id=0;

    student()
    {
        id=551;
        name="dhruv"; 
    }
    void display()
    {
        System.out.println("The id is:"+id);
        System.out.println("The name is:"+name);
        System.out.println("The event id is:"+event_id);
    }
    public static void main(String args[])
    {
        student s=new student();
        s.display();
    }
};

