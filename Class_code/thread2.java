class welcomemessage extends Thread
{
    int i;
    welcomemessage(int a)
    {
        i=a;
    }
    public void run()
    {
        System.out.println("Welcome to the concept of thread"+i);
    }
}
class thread2
{
    public static void main(String[] args) 
    {
        welcomemessage w=new welcomemessage(0);
        welcomemessage w1=new welcomemessage(1);
        welcomemessage w2=new welcomemessage(2);
        welcomemessage w3=new welcomemessage(3);

        w.start();
        w1.start();
        w2.start();
        w3.start();
    }
}