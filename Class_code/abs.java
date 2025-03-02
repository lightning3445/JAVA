abstract class dummy
{
    int a=1;
    void display()
    {
        System.out.println("A:"+a);
    }
}
class dum extends dummy
{
    int b=2;
    void display1()
    {
        System.out.println("B:"+b);
    }
}
public class abs 
{
    public static void main(String[] args) 
    {
        dum d=new dum();
        d.display();    
        d.display1(); 
    }
}
