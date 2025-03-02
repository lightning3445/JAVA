class demo3
{
    final int pi=3;
    void display(int r)
    {
        System.out.println("Area:"+(r*r*pi));
    }
}
class fina 
{
    public static void main(String [] a)
    {
        demo3 d=new demo3();
        d.display(5);
    }    
}
