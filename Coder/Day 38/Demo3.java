import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {
        
        // (x+2) * 3 -> 

        // Function<Integer,Integer> equation = x -> ((x+2) * 3);

        // System.out.println(equation.apply(2));

        Function<Integer,Integer> add2 = x -> x+2; // f(x)
        Function<Integer,Integer> multiply3 = x -> x*3; // g(x)
        Function<Integer,Integer> divide2 = x -> x/2;

        // int a = add2.apply(2);
        // int b = multiply3.apply(a);
        // System.out.println(b);

        int ans = multiply3.apply(add2.apply(2)); // g(f(x))

        int ans2 = add2.andThen(multiply3).apply(2); // L to R chalta hai ye.
        System.out.println(ans2);
        // 

        Function<Integer,Integer> ansFunc = add2.andThen(multiply3);

        int ans3 = ansFunc.apply(2);
        System.out.println(ans3);
    }
}
