import java.util.*;
public class sort
{
    public static void main(String[] arg)
    {
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter values:");
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
