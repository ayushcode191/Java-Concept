import java.util.*;

public class Demo {
    public static void main(String[] args) {

        List<int[]> list = new ArrayList<>();
        int count = 0;

        while(true){
            list.add(new int[250000]); // int -> 4 byte -> 1 M byte -> 1 MB

            count++;
            System.out.println("Allocated Block:" + count);
        }

    }
}