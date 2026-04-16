import java.util.*;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        
        // Terminal Operation

        List<Integer> list = new ArrayList<>(List.of(1,13,11,9));

        // list.stream()
        //     .map(x -> x+1)
        //     .forEach(System.out::println);
            
        // list.stream()
        //     .map(x -> x+1)
        //     .forEachOrdered(System.out::println);

        // Immutable List
        // List<Integer> list2 = list.stream()
        //     .map(x -> x+1)
        //     .toList();
        // System.out.println(list2);

        // Mutable List
        // List<Integer> list3 = list.stream()
        //     .map(x -> x+1)
        //     .collect(Collectors.toList());
    
        // list3.add(9);
        // System.out.println(list3);

        // Set<Integer> set1 = list.stream()
        //     .map(x -> x+1)
        //     .collect(Collectors.toSet());

        // Optional<Integer> sum = list.stream()
        //     .reduce((a,b) -> a+b);

        // Identity :- base value
        // int sum = list.stream()
        //     .reduce(0, (a,b) -> a+b);
        
        // System.out.println(sum);


        // long num = list.stream()
        //     .filter(x -> x>10)
        //     .count();

        // Optional<Integer> num = list.stream()
        //         .filter(x -> x > 10)
        //         .findFirst();
        // System.out.println(num.get());

        // Optional<Integer> num = list.stream()
        //         .filter(x -> x > 10)
        //         .findAny();
        // System.out.println(num.get());

        // boolean num = list.stream()
        //     .filter(x -> x > 10)
        //     .anyMatch(x -> x%2==0);
        // System.out.println(num);

        // boolean num = list.stream()
        //     .filter(x -> x > 10)
        //     .allMatch(x -> x%2==0);
        // System.out.println(num);

        // boolean num = list.stream()
        //     .filter(x -> x > 10)
        //     .noneMatch(x -> x%2==0);
        // System.out.println(num);


        // int sum = list.stream()
        //             .filter(x -> x > 10)
        //             .mapToInt(x -> x)
        //             .sum();

        // System.out.println(sum);

        // OptionalInt max = list.stream()
        //             .filter(x -> x > 10)
        //             .mapToInt(x -> x)
        //             .max();

        // System.out.println(max.getAsInt());

        // OptionalDouble avg = list.stream()
        //             .filter(x -> x > 10)
        //             .mapToInt(x -> x)
        //             .average();

        // System.out.println(avg.getAsDouble());


    }
}

// forEach()
// forEachOrdered()
// toList()
// collect() -> Collector
// Collector (I) -> Collectors(Utility Class)
// reduce() :- Combine all values to single value
// count()
// findFirst():- do short circuiting
// findAny()
// anyMatch(), allMatch(), noneMatch()
// sum() average() max() min()  ---> Primitive streams
