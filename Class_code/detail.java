//wap in java to take usr input like name,ph no,bill amt and qty
import java.util.*;
class detail
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Full name:");
        String fname=s.nextLine();
        System.out.println("Enter phone number:");
        int p=s.nextInt();
        System.out.println("Enter bill:");
        float g=s.nextFloat();
        System.out.println("Enter qty:");
        int q=s.nextInt();
        System.out.println(fname+"\n"+p+"\n"+g+"\n"+q+"\n");
    }
}