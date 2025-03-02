class marks
{
    int total=0;
    int calculate(int...n)
    {
        for(int i:n)
        {
            total+=i;
        }
        return total;
    }
}
class student extends marks
{
    void setname(String n)
    {
        System.out.println("Name:"+n);
        System.out.println("Total:"+calculate(10,20,30));
    }
}
public class inheritance extends student
{
    public static void main(String [] args)
    {
        student s=new student();
        s.setname(args[0]);
    }    
}
