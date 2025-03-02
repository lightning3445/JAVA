//wap to declare two var roll and name as instant var.
//create a method name display detail that displays roll and name of five students
//create another method to fetch the details of roll and name of five diff 
//students(hint create five diff obj of same class)
class Student
{
    int roll_no;//instance var
    String name;
    void details()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        name=s.nextLine();
        System.out.println("Enter rollno:");
        roll_no=s.nextInt();      
    }
    void display()
    {
        System.out.println("Name"+name+"\troll_no"+roll_no);
    }
} 
public class constructor {
    
}
