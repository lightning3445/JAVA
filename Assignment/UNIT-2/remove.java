import java.util.*;
class remove
{
    public static void main(String[] args)
    {
        int[] arr={10,20,30,10};
        int length=arr.length;
        int[] temp=new int[length];
        int j=0;

        Arrays.sort(arr);

        for(int i=0;i<length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[length-1];
        System.out.println("Array after removing duplicate");

        for(int i=0;i<j;i++)
        {
            System.out.println(temp[i]+"");
        }
    }
}