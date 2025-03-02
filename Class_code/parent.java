class pare
{
    final void display()
    {
        System.out.println("hi");
    }
}
class child extends pare
{
    void dis()
    {
        System.out.println("Hello");
    }
}
public class parent
{
    public static void main(String[] args) 
    {
        child c=new child();
        c.dis();
    }
}
