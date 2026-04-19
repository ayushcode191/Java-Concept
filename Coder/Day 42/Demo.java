import java.util.*;


public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11));

        // sequential streams
        // list.stream()
        // .map(x -> x*2) // stateless operation
        // .sorted() // statefull operation
        // .forEach(System.out::println);


        // parallel stream -> multiple thread me execute hota hai.
        list.parallelStream()
            .map(x -> x*2)
            .forEach(System.out::println); // order different ho jayega and less time lega.

        list.parallelStream()
            .map(x -> x*2)
            .forEachOrdered(System.out::println); 
        // extra overhead -> paralleism khatam ho jaega.

        

        
    }
}

// splitIterator