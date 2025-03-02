class demo
{
    int n;
    demo(int n)
    {
        this.n=n;//use to access the instance variable
    }
    void display()
    {
        System.out.println(n);
    }
}
public class this_ex 
{
    public static void main(String[] args)
    {
        demo d=new demo(12);
        d.display();
    }
}
