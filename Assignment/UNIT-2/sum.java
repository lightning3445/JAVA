import java.util.*;
class sum 
{
    int su;
    int add(int...numbers)
    {
        for(int i:numbers)
        {
            su=su+i;
        }
        return su;
    }
    public static void main(String[] args) 
    {
        sum s=new sum();
        int re=s.add(1,2,3,4,5);
        System.out.println(re);
    }
}
