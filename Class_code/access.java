class bank
{
    private int acc_no=123;
    int code=1;

    void display()
    {
        System.out.println("Acc_no is:"+acc_no);
        System.out.println("Code is:"+code);
    }
}
public class access 
{
    public static void main(String[] arg)
    {
        bank b=new bank();
        b.display();
         //System.out.println("Bank Account Num : "+b.accno);  //Can't be access because it is private
        //System.out.println("Branch Code : "+b.branchcode);  
    }
}
