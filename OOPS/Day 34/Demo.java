import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Constructor of HashSet/ LinkedHashSet => All 4 applicable for LinkedHashSet also.
        Set<Integer> set = new HashSet<>(); // 16 size

        // Initial Capacity
        Set<Integer> set2 = new HashSet<>(100);

        // Capacity, Load factor(0.75f) by default
        Set<Integer> set3 = new HashSet<>(100,0.8f);

        // Using another collection
        Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4,5,6,7,8));


        
    }
}
