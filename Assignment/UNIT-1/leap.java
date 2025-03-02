import javax.swing.JOptionPane;
public class leap 
{
   public static void main(String[] arg)
   {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter year:"));
        if(a%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }
}
