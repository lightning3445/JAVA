import java.util.*;
public class diagonal 
{
    public static void main(String[] args) 
    {
        int[][] arr=new int[4][4];
        int sum=0;
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                Scanner s=new Scanner(System.in);
                System.out.println("Eter values:");
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                    System.out.println(arr[i][j]+" ");
                    sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
