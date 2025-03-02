public class exp_han_prac extends Exception
{
    public static void main(String[] args)
    {
        try
        {
            if(Character.isDigit('1') && Character.isDigit('2'))
            {
                int a=integer.parseint(args[0]);
                int b=integer.parseint(args[1]);
                try
                {
                    if(b==0)
                    {
                        throw new ArthmeticException("Dividing by zero is not possible");
                    }
                    else
                    {
                        System.out.println(a/b);
                    }
                }
                catch (ArthmeticException e)
                {
                    System.out.println(e);
                }
            }
            else
            {
                
            }
        }    
    }    
}
