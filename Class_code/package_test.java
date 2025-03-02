import MathOperation.arthmetics;
class package_test
{
    public static void main(String [] args)
    {
        arthmetics a=new arthmetics();
        System.out.println("Addition"+a.add(10,20));
        System.out.println("subtraction"+a.sub(10,20));
        System.out.println("multiplication"+a.mul(10,20));
        System.out.println("division"+a.div(10,20));
    }
}