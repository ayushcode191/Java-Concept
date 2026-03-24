
public class Demo2 {
    public static void main(String[] args) {
        String s1 = "ja" + "va";
        String s2 = "java";
        // System.out.println(s1 == s2); // true

        String s3 = "Hello";
        String s4 = s3 + "World";
        String s5 = "Hello World";
        // System.out.println(s4 == s5); // false


        String s6 = "Hello";
        String s7 = s6;
        System.out.println(s6 == s7);
        
    }
}


// String pool => "hello" , "World", "Hello World"
// Heap => "Hello World"