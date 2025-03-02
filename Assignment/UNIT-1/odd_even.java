import java.util.*;
import javax.swing.JOptionPane;
public class odd_even
{
    public int b;
    odd_even(int a)
    {
        b=a;
    }
    void oe()
    {
        if(b%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }  
    public static void main(String[] arg)
    {
        int c=Integer.parseInt(JOptionPane.showInputDialog("Enter number:"));
        odd_even s=new odd_even(c);
        s.oe();
    }
}
