public class Demo {
    public static void main(String[] args) {
        // Upcasting
        String s = "Hello";
        Object obj = s;

        System.out.println(obj);

        // Downcasting
        Object obj2 = "Ayush";
        String s2 = (String) obj2;

        System.out.println(s2);

        Object obj3 = 10;
        String s3 = (String) obj3; // Run time error => ClassCastException

        System.out.println(s3);
    }
}