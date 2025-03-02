class welcomemessage extends Thread
{
    public void run()
    {
        System.out.println("Welcome to the concept of thread");
    }
}
class thread_mul
{
    public static void main(String[] args) 
    {
        welcomemessage w=new welcomemessage();
        w.start();
    }
}