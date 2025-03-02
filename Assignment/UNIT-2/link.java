import java.util.*;
class link
{
    public static void main(String[] arg)
    {
        LinkedList<String> list=new LinkedList<>();

        list.add("Apple");
        list.add("cherry");
        list.add("banana");
        list.add("chiku");

        System.out.println(list);

        list.add(1,"mango");

        System.out.println(list);

        LinkedList<String> newlist=new LinkedList<>();

        newlist.add("elederberry");
        newlist.add("fig");

        list.addAll(newlist);

        System.out.println(list);

        list.addFirst("apricot");

        System.out.println(list);

        String element=list.get(2);
        
        System.out.println(element);

        int lastindex=list.lastIndexOf("banana");
        System.out.println(lastindex);
    }
}