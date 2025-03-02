import java.util.*;
class bank //super keyword - for calling cons
{
    int a;
    bank(int acc_no)
    {
        a=acc_no;
    }
    void display()
    {
        System.out.println(" Account no is : " +a);
    }
}
class person extends bank
{
    String name;
    person(String n, int acc)
    {
        super(acc);
        super.display(acc);

        name=n;
    }
    void display()
        {
            System.out.println(super.a+""+name);
        }
}
class super_ex
{
    public static 
}
