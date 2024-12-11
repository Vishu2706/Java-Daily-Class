
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(10.10);
        al.add("Tops");
        al.add('A');
        al.add(null);
        al.add(true);
        System.out.println(al);
        System.out.println(al.get(3));
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.indexOf(true));
        System.out.println(al.isEmpty());
        System.out.println(al.lastIndexOf(10));
        System.out.println(al.remove(4));
        System.out.println("al = " + al);
        al.set(4, 1000);
        System.out.println("al = "+al);
        Iterator itr = al.iterator();
        System.out.println("------Iterator Elements--------");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator litr = al.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("------List iterator in reverse element");

        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}