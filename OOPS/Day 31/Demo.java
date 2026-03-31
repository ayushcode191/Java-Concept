import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Collection<Integer> c = new HashSet<>();
        Collection<Integer> c = new LinkedList<>();
        c.add(10);
        c.add(20);
        c.add(30);

        //size()
        int n = c.size();
        // System.out.println(n);

        // System.out.println(c.isEmpty()); // optimised 
        // // c.size() == 0 

        // // boolean contains(Object o) ---> 1,2,3  --> equals()
        // System.out.println(c.contains(20));

        // iterate() => Iterator

        // Object[] toArray();
        // Object[] obj = c.toArray();
        // for(Object o : obj){
        //     System.out.println(o);
        // }

        // T[] toArray(T[] a)
        // Integer[] arr2 = new Integer[0];
        // Integer[] arr = c.toArray(arr2);
        // Integer[] arr = c.toArray(new Integer[0]);
        // for(Integer i : arr){
        //     System.out.println(i);
        // }

        // boolean add(E e);
        // boolean b = c.add(40);
        // boolean x = c.add(10); // false in case of HashSet duplicate value

        // boolean remove(Object obj);
        // System.out.println(c.remove(20)); // remove first occurence
        
        // boolean addAll(Collection<? extends E> c);
        c.addAll(List.of(5,6,7,8,9));

        System.out.println(c);

        // boolean containsAll(Collection<?> c);

        System.out.println(c.containsAll(List.of(7,8,9)));

        // boolean removeAll(Collection<?> c);

        // boolean retainAll(Collection<?> c);
        
        // c.removeAll(List.of(10,20));
        // c.retainAll(List.of(10,20));
        System.out.println(c);


        // clear()
        // c.clear();
        System.out.println(c);


        // equals() hashcode() 

    }
}

// add remove addAll removeAll retainAll containsAll toArray iterator size isEmpty