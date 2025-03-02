import javax.swing.JOptionPane;
public class dialogue {
    public static void main(String[] args)
    {
        System.out.println(args[0]);
        System.out.println(args[1]);
        int x=Integer.parseInt(args[0]);
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter value:"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter value 2:"));
        // System.out.println((a+b)+Integer.parseInt((args[0])));
        System.out.println((a+b)+x);
    }
}
