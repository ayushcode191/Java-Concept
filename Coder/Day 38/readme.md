# Lambda Expression & Method Reference
=> apne functional interface => ha bana sakte but raerly need hoti iski

// java.util.function package hai jiske andar sare functional interface hote java ke

=> 4 core FI
1. Function
2. Consumer
3. Supplier
4. Predicate


1. Function:- Take input (any type) and transform it to output.
T -> R

interface Function<T,R>{
    R apply(T t);
}

Lambda Expression:- (x) -> x*x;

2. Consumer:- Take input T and no output
T -> void

public interface Consumer {
    void accept(T t);
}

Lambda Expression:- (x) -> System.out.println(x);

3. Supplier:- Take no input and give output T.
void -> T

public interface Supplier<T>{
    T get();
}

Lambda Expression:- () -> Math.random();

4. Predicate:- takes an input and return boolean
T -> boolean

public interface Predicate<T> {
    boolean Test(T t);
}

Lambda Expression:- (x) -> (x%2==0)

