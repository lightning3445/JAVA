import java.util.*;
class link
{
    public static void main(String[] arg)
    {
        LinkedList <Integer> l = new LinkedList <> ();
        l.add(25);
        l.add(35);
        l.add(0,12);
        System.out.println(l);
        l.addFirst(45);
        l.addLast(58);
        System.out.println(l);
        System.out.println(l.contains(12));
        System.out.println(l.get(3));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);
        System.out.println(l.remove());
        System.out.println(l);
        System.out.println(l.remove(2));
        System.out.println(l);
        // l.clear();
        // System.out.println(l);
        System.out.println(l.remove(1));
        l.add(34);
        System.out.println(l);
        l.add(92);
        Collections.sort(l);
        // System.out.println(l.get(1));
    }
}