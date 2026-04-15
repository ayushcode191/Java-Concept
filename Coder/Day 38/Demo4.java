import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {
        Predicate<Integer> isGreater = x -> x > 100;
        Predicate<Integer> isEven = x -> x%2==0;


        System.out.println(isGreater.and(isEven).test(2));

        System.out.println(isGreater.or(isEven).test(103));

        

        Predicate<Integer> isOdd = isEven.negate();
        System.out.println(isOdd.test(45));

        

    }
}
