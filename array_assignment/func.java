import java.util.*;
class func
{
    int salary;
    String name;
    int ID;
    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name");
        name=s.nextLine();
        System.out.print("Enter ID");
        ID=s.nextInt();
        System.out.print("Enter Salary");
        salary=s.nextInt();
    }
    void display()
    {
        System.out.println("Name: "+name+" , ID: "+ID+" Salary: "+salary);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.print("Enter Number Of Employees:");
        num=s.nextInt();
        func[] stud = new func[num];
        int i;
        System.out.println("Input Employee Details:");
        for(i=0;i<num;i++)
        {
            stud[i] = new func();
            stud[i].input();
        }
        System.out.println("Employee Details:");
        for(i=0;i<num;i++)
        {
            stud[i].display();
        }
        int l;
        l=stud[0].salary;
        for(i=0;i<num;i++)
        {
            for(int j=1;j<(num-i);j++)
            {
                if(stud[j-1].salary>stud[j].salary)
                {
                    func temp=stud[j-1];
                    stud[j-1]=stud[j];
                    stud[j]=temp;
                }
            }
        }
        System.out.println("Employee Details After Sort:");
        for(i=0;i<num;i++)
        {
            stud[i].display();
        }


    }
}