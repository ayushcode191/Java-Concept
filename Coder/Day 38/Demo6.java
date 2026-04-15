import java.util.function.Consumer;

public class Demo6 {
    public static void main(String[] args) {
        // print(String)

        Consumer<String> printName = System.out::println;
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

        Consumer<String> pipeLine = printName.andThen(printUpperCase);

        pipeLine.accept("Aditya");

        
    }
}
