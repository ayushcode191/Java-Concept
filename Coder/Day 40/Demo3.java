import java.util.*;
import java.util.stream.Collectors;
public class Demo3 {
    public static void main(String[] args) {
        
        // List<Integer> list = new ArrayList<>(List.of(1,13,11,9));

        // List<Integer> list2 = list.stream()
        //     .map(x -> x+1)
        //     .collect(Collectors.toList());

        // Set<Integer> set2 = list.stream()
        //     .map(x -> x+1)
        //     .collect(Collectors.toSet());
        

        // System.out.println(list2);


        List<String> list3 = new ArrayList<>(List.of("AA","BBB","CCCC", "DD","EEE"));

        // // Map<Integer,String> map = list3.stream()
        // //                                 .collect(Collectors.toMap(
        // //                                     x -> x.length(),
        // //                                     x -> x));

        // Map<Integer,List<String>> map1 = list3.stream()
        //                                 .collect(Collectors.groupingBy(x -> x.length()));

        // System.out.println(map1);


        // Map<Boolean,List<Integer>> mp = list.stream()
        //                                 .collect(Collectors.partitioningBy(x -> x%2 == 0));

        // System.out.println(mp);


        // Map<Integer,List<String>> mp1 = list3.stream()
        //                                 .collect(Collectors.groupingBy(
        //                                     x -> x.length(),
        //                                     Collectors.mapping(x -> x.toLowerCase(), Collectors.toList())
        //                                 ));
        // System.out.println(mp1);

        // String res = list3.stream()
        //     .collect(Collectors.joining("-"));
        // System.out.println(res);
    

    }
}

// toMap(), toSet(), toList()
// groupingBy() -> mapping() 
// partitioningBy() -> only on the basis of true and false map return key boolean
// joining()


// class Employee{

// }

// employees.stream()
//         .collect(Collectors.groupingBy(emp -> emp.getDepartment()))