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
        Scanner s = new Scanner();
        System.out.println("Enter Name");
        name=getLine();
        System.out.println("Enter Name");
        id=nextInt();

        
    }
    public static void main(String args[])
    {
        arr[] s=new arr[2];
        int i;
        for(i=0;i<5;i++)
        {
            arr[i] =  new arr();
            a[i].display();
        }
    }
};
