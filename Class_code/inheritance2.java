class marks
{
    static int total=0;
    static int calculate(int... n)
    {
        for(int i:n)
        {
            total+=i;
        }
        return total;
    }
}
class grade extends marks
{
    static String gradechk()
    {
        if(total>50)
        {
            return "A";
        }
        else
        {
            return "B";
        }
    }
}
public class inheritance2 extends grade
{
    public static void main(String[] args) 
    {
        System.out.println(gradechk());
        System.out.println(calculate(10,20,30,40,50));    
    }
}
