// BufferedReader
import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        String name = br.readLine();

        System.out.println(name);
    }

}


/**
 * 1.Aditya
 * 2. OS Buffer (65,100,105,116,121,97)
 * 3. System.in (InputStream) recieve bytes 
 * 4. InputStreamReader ---> stream of bytes into stream of characters ('A','D','T','Y','A')
 * 5. BufferedReader --> readLine ---> Aditya ---> name
 */

/**
 * Limitation -> read only String
 */

/**
 * Java 1.5 => Scanner 
 * Simplify
 * int double all read
 */