import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        // TreeSet 

        TreeSet<Integer> set = new TreeSet<>();

        // Set<Integer> set2 = new TreeSet<>(List.of(2,5,7,6));

        set.add(80);
        set.add(23);
        set.add(10);
        set.add(90);
        set.add(50);

        // SortedSet Interface O(log n)
        // System.out.println(set.first());
        // System.out.println(set.last());


        // System.out.println(set.headSet(80)); // 80 se strictly less element excluded
        // System.out.println(set.tailSet(80)); // 80 se equal or greter included

        // System.out.println(set.subSet(23,80)); // from is excluded , last is inclusive


        // Navigable Set
        // largest no smaller than 80
        // System.out.println(set.lower(80));

        // // gretest no less than or equal to 80
        // System.out.println(set.floor(80));

        // // smallest no greater than 80
        // System.out.println(set.higher(80));

        // // smallest no greater than or equal to 80
        // System.out.println(set.ceiling(80));

        // System.out.println(set.pollFirst());
        // System.out.println(set.pollLast());

        // System.out.println(set.first());

        // System.out.println(set.descendingSet());

        // Iterator<Integer> it = set.descendingIterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // Inclusive true
        // System.out.println(set.headSet(80, true));
        // System.out.println(set.tailSet(80,false));

        

    }
}

// BST => leftest left node => smallest
// rightest right most node => largest
