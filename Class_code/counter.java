class counter
{
    static int count;

    public counter()
    {
        count++;
    }
    static int counte()
    {
        return count;
    }
    public static void main(String[] args)
    {
        counter c1=new counter();
        counter c2=new counter();
        counter c3=new counter();
        System.out.println("The no. of objects are:"+counter.counte());
    }
}