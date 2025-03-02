public class conversion 
{
    public static void main(String[] args)
    {
        float bill=100.25f;
        System.out.println(bill);
        int a=100;
        bill=(float) a;
        a=(int)bill; //explicit conversion
        System.out.println(a);
        System.out.println(bill);
    }   
}
