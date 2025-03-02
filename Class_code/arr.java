import java.util.*;
class arr
{
    int id;
    String name;
    static int event_id=0;

    arr()
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
        arr[] s=new arr[2];
        s[0]=new arr();
        System.out.println("Details of student 0:");
        s[0].display();
        s[1]=new arr();
        System.out.println("Details of student 1:");
        s[1].display();
    }
};
