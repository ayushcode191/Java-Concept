// String Methods
public class Demo2 {
    public static void main(String[] args) {
        String s1 = new String("Aditya");
        String s2 = new String("Aditya");

        //Length/ Emptiness
        // System.out.println(s1.length());
        // System.out.println(s1.isEmpty());
        // System.out.println(s1.isBlank()); // only space par bhi true deta hai ye

        // Character access
        System.out.println(s1.charAt(2));
        char[] arr = s1.toCharArray();

        // Comparsion
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        // Lexicographical Comparison
        System.out.println(s1.compareTo(s2));

        // Searching
        System.out.println(s1.contains("ity")); // true
        System.out.println(s1.indexOf('i'));
        System.out.println(s1.indexOf("ity"));
        System.out.println(s1.lastIndexOf('a'));

        System.out.println(s1.startsWith("Ad"));

        // Extraction / transformation
        System.out.println(s1.substring(1,4));

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim()); // remove space form last and start
        System.out.println(s1.strip()); // unicode friendly
        
        System.out.println(s1.repeat(3));

        System.out.println(s1.replace('i','a'));
        System.out.println(s1.replace("ity","abc"));

        System.out.println(s1.replaceAll("ad", "ab"));


        String s3 = "Aditya, Rohit, Rohan";
        String[] arr3 = s3.split((","));
        for(String s : arr3){
            System.out.println(s);
        }

        System.out.println(String.join("-","a","b","c"));


        // conversion
        String s4 = new String(String.valueOf(10));

        byte[] arr4 = s1.getBytes();
        for(byte b : arr4){
            System.out.print(b + " ");
        }
        System.out.println();

        // Advance -> intern() format()
        String s5 = new String("Hello");
        // String s6 = s5; // isme dono heap me ek ko hi point karege
        String s6 = s5.intern(); // s5 ko string pool me lakar use s6 point akrega and s5 heap vale ko hi point karega

        // format()
        String name = "Ayush";
        int age = 21;

        System.out.println(String.format("Hello %s, your age is %s",name, age));
    }
}

// equals() => override for content check
// compareTo() => -ve, 0, +ve if s1 < s2 then -ve
// substring(first,last) => first to last-1

/**
 * String pool 
 * Heap s5 -> Hello -> s6
 */
