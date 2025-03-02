interface vehicle
{
    //by default declared variable has final and staticv so it can't be changed or updates u gotcha or wht !!
    int wheels=2;
    void stop();
    //if u don't wanna make all fucntions public u can use default in front of function in interface
    default void run()
    {
        System.out.println ("HOI");
    }
}
class car implements vehicle
{
    public void stop()
    {
        System.out.println("Stop the vehicle"); 
    }
    public void run()
    {
    }
}
public class interface_ex
{
    public static void main(String[] args) 
    {
        car c=new car();
        c.stop();
        System.out.println(c.wheels);
    }
    //wheels value can't be changed bcz it's final
    //c.wheels=5;
}
