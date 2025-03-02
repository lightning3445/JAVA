import java.util.*;
public class array_list
{
    public static void main(String[] arg)
    {
        ArrayList<String> list=new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("papaya");
        list.add("grapes");

        String element=list.get(2);
        System.out.println(element);
        
        boolean con=list.contains("mango");
        System.out.println(con);

        list.remove("banana");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
