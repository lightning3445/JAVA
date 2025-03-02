import java.util.*;
class descending
{
    public static void main(String[] args) 
    {
        Integer[] arr={1,5,8,9,4};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
