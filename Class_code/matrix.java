//wap to find multiplication, addtion and subtraction of 2d matrix. use menu driven
import java.util.*;
class matrix 
{

    public static void main(String[] args)
    {
        int[][] a= new int[10][10];
        int[][] b= new int[10][10];
        int[][] add= new int[10][10];
        int[][] sub= new int[10][10];
        int[][] mul= new int[10][10];
        int ch;

        Scanner s=new Scanner(System.in);

        System.out.println("for addition");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter values of a 1:");
                a[i][j] = s.nextInt();
                System.out.println("Enter values of b:");
                b[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                add[i][j]=a[i][j]+a[i][j];
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                sub[i][j]=a[i][j]-a[i][j];
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                mul[i][j]=a[i][j]*a[i][j];
            }
        }

        System.out.println("Enter the value 1,2,3");
        ch = s.nextInt();

        switch(ch)
        {
            case 1:
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        System.out.print(add[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        System.out.print(sub[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 3:
                for(int i=0;i<2;i++)
                {
                    for(int j=0;j<2;j++)
                    {
                        System.out.print(mul[i][j]);
                    }
                    System.out.println();
                }
                break;
                default:
                System.out.println("Wrong Choice!");
        }
    }
}
