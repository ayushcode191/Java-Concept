import java.util.*;
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // System.out.println(list.get(1));

        // list.set(1,5);

        // System.out.println(list);
        // list.addAll(0,List.of(9,8,7));

        // list.remove(0);

        // System.out.println(list);

        // System.out.println(list.indexOf(5));
        // System.out.println(list.lastIndexOf(5));



        // ListIterator<Integer> it = list.listIterator(3);

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // while (it.hasPrevious()) {
        //     System.out.println(it.previousIndex());
        //     it.previous();
        // }


        List<Integer> l = List.of(1,2,3,4,5,6,7,8);
        // l.add(9); // Exception

        List<Integer> l2 = List.copyOf(l);
        // l.add(9); // Exception

    }
}

