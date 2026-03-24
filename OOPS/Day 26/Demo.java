
public class Demo {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);
        String s2 = new String("Hello");

        String s3 = "Ayush";
        String s4 = new String(s3);

        // char array
        char[] arr = {'A','y','u','s','h',' ','B','a','n','s','a','l'};
        String s5 = new String(arr);
        arr[0] = 'C';
        System.out.println(s5); // Ayush
        String s6 = new String(arr,0,6);
        System.out.println(s6);

        // byte array
        byte[] arr2 = {97,98,99,101,102};
        String s7 = new String(arr2);
        System.out.println(s7);

        // StringBuilder StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        String s8 = new String(sb);

        StringBuffer sbf = new StringBuffer("Hello");
        String s9 = new String(sbf);


        
    }
}

// Constructors