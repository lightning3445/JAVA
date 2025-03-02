import java.util.*;
public class area
{
    int b,h;
    float l,w;
    area(int x, int y)
    {
        b=x;
        h=y;
    }
    area(float a,float c)
    {   
        l=a;
        w=c;
    }
    void tri()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter base:");
        b=s.nextInt();
        System.out.println("Enter height:");
        h=s.nextInt();
        double aot=0.5*(b*h);
        System.out.println(aot);
    }
    void rec()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length:");
        l=s.nextFloat();
        System.out.println("Enter width:");
        w=s.nextFloat();
        float aor=l*w;
        System.out.println(aor);
    }
    public static void main(String[] arg)
    {
        area a=new area(10,10);
        area b=new area(10,10);
        a.tri();
        b.rec();
    }
}
