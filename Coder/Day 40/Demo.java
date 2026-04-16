import java.util.*;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 4, 34,30,23,21,11));

        // Intermediate Operation
        list.stream()
            .filter(x -> x > 10)
            // .filter(x -> x%2 == 0)
            .map(x -> x*2)
            .peek(System.out::println)
            .sorted()
            .distinct()
            .forEach(System.out::println);

        // List<List<Integer>> list2 = List.of(
        //     List.of(1,2),
        //     List.of(3,4)
        // );

        // list2.stream()
        //     .flatMap(x -> x.stream())
        //     .map(x -> x*2)
        //     .forEach(System.out::println);


        // Stream.iterate(1, x -> x+1)
        //         .limit(10)
        //         .skip(5)
        //         .forEach(System.out::println);

        
    }
}

// filter():- stateless
// map():- stateless
// flatMap() -> flatening operation
// sorted() :- statefull hota hai yaha tak sari chij ho jati then sorted kaam karta hai
// distinct():- keep unique values (HashMap) -> statefull
// limit()
// skip()
// peek() -> used for debugging
// stream me normal debugger kam nahi karta beech me dekhne ke liye

// mapToInt()
// mapToDouble()



