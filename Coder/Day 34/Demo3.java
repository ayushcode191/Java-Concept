import java.util.*;


public class Demo3 {
    public static void main(String[] args) {
        // RollNo, Names
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"Ayush");
        map.put(102, "Vaibhav");
        map.put(103, "Shivani");

        // System.out.println(map.size());
        // System.out.println(map.isEmpty());

        // System.out.println(map.containsKey(103)); // O(1)
        // System.out.println(map.containsValue("Ayush")); // O(n)

        // // Value if key exists otherwise return null
        // System.out.println(map.get(101));

        // // return null if new key , if already exist key then return old value
        // System.out.println(map.put(104,"Abhay"));

        // System.out.println(map.remove(101));

        // Map<Integer,String> map2 = new HashMap<>();
        // map.putAll(map2);

        // map.clear();


        // Set<Integer> set = map.keySet();
        // System.out.println(set);

        // Collection<String> c = map.values();
        // System.out.println(c);

        // Set<Map.Entry<Integer,String>> entries = map.entrySet();
        // System.out.println(entries);

        // System.out.println(map.getOrDefault(104, "Unknown"));

        System.out.println(map.putIfAbsent(104, "Ayushi"));

        // map.remove(101);
        // map.remove(101,"Abhay");

        // never put new key
        // map.replace(101, "Shivam");

        // map.replace(101, "Aditya","Shivam");

        Set<Map.Entry<Integer,String>> entries = map.entrySet();

        // for(Map.Entry<Integer,String> entry : entries){
        //     Integer key = entry.getKey();
        //     String value = entry.getValue();

        //     System.out.println(key +" ,"+value);
        // }


        // Immutable Map
        // Map<Integer,String> map2 = Map.of(101,"Aditya", 102,"Aditi");


    }
}

// put() => Always replace
// putIfAbsent() => does not replace existing value.