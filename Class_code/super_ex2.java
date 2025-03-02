class student
{
    String name;
    void display(String n)
    {
        name=n;
        System.out.println(n);
    }
}
class marks extends student
{
    int marks;
    void display(int m,String n)
    {
        marks=m;
        super.display(n);
        System.out.println(m);
    }
}
public class super_ex2
{
    public static void main(String[] args) 
    {
        marks m=new marks();
        m.display(50,"dhruv");    
    }
}
