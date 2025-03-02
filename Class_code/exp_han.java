import java.util.*;
class divideclass
{
    float divide(int a,int b)
    {
        return a/b;
    }
}
class exp_han
{
    public static void main(String[] args) 
    {
        divideclass d=new divideclass();
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();    
        int b=s.nextInt();
        try
        {
            System.out.println(d.divide(a,b));
            System.out.println("bye");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero error");
        }
        finally //statement which we want to print even if it generate error
        {
            System.out.println("bye");
        }
    }
}