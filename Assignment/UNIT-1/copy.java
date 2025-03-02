import java.util.*;
class length 
{
    double feet;
    double cm;

     length(double ft)
    {
        feet=ft;
        cm=ft*30.48;
    }
    //copy constructor
     length(length o)
    {
        feet=o.feet;
        cm=o.cm;
    }

    void display()
    {
        System.out.println("length in feets "+feet);
        System.out.println("length in cm "+cm);
    }
}
    public class copy
    {
        public static void main(String[] args) 
        {
            length o=new length(5);
            System.out.println("Original length:");
            o.display();
            
            length c=new length(o);
            c.display();
        }
    }
