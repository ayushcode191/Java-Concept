import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        int x = System.in.read();  // can give only integer value

        // System.out.println(x);
        System.out.println((char)x);
    }
}

// A --> 65 ---> Binary form of 65
// read() -> 1 Byte At a time => baki InputBuffer me hi rah jayega
// loop lagana padega 

