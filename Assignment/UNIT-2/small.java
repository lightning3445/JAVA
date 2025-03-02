import java.util.*;
public class small 
{
    public static void main(String[] args) 
    {
        int temp;
        int [] arr=new int [10];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter values:");
            arr[i]=s.nextInt();
        }
        temp=arr[0];
        for(int i=0;i<10;i++)
        {
            if(arr[i]<temp)
            {
                temp=arr[i];
            }
        }
        System.out.println(temp);
    }    
}
