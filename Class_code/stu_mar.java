import javax.swing.JOptionPane;
public class stu_mar {
    public static void main(String[] args)
    {
        int eng=Integer.parseInt(JOptionPane.showInputDialog("Enter marks of english"));
        int acc=Integer.parseInt(JOptionPane.showInputDialog("Enter marks of acc"));
        int stats=Integer.parseInt(JOptionPane.showInputDialog("Enter marks of stats"));
        String name=JOptionPane.showInputDialog("Enter name");
        System.out.println(name);
        System.out.println((eng+acc+stats));
    }
}
