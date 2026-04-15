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



=> Primitive Functional Interfaces
// tradition vale se again and again auto boxing and unboxing hoti thi.

// int long double ke liye banaye. because ye sab jyada use hote hai.

1. Function (Primitive family)

=> IntFunction<T>:- int -> R
=> LongFunction<T>:- long -> R
=> DoubleFunction<T>:- double -> R

=> ToIntFunction<T>:- T -> int
=> ToLongFunction<T>:- T -> long
=> ToDoubleFunction<T>:- T -> double


2. Consumer (Primitive family)

=> IntConsumer:- int -> void
=> LongConsumer:- long -> void
=> DoubleConsumer:- double -> void

=> ObjectIntConsumer<T>:- (T,int) -> void
=> ObjectLongConsumer<T>:- (T,long) -> void
=> ObjectDoubleConsumer<T>:- (T,double) -> void



3. Supplier (Primitive family)

=> IntSupplier:- void -> int
=> LongSupplier:- void -> long
=> DoubleSupplier:- void -> double


4. Predicate (Primitive family)

=> IntPrediate:- int -> boolean
=> LongPredicate:- long -> boolean
=> DoublePredicate:- double -> boolean



# Primitive Operator Family.
=> Both Input and output are primitive.

1. IntUnaryOperator:- (int -> int)
2. LongUnaryOperator:- (long -> long)
3. DoubleUnaryOperator:- (double -> double)


1. IntBinaryOperator:- ((int,int) -> int) 
etc.



# Method Reference
=> Optimization of Lambda
(x) -> System.out.println(x);
list.forEach(
    System.out:: println  :- use this method when needed.
    )

=> className :: Method name
=> Method Reference Operator
=> when we can use Method refernce
=> only in case of inbuilt function


=> Types of Method Reference
1. Static Method Refernce
x -> Math.abs(x)
(Math::abs)
className::MethodName

2. Instance Method Refernce
(System.out::println)

3. Prdicate Method reference
str -> str.isEmpty()
(String :: isEmpty)

4. Constructor Reference
Supplier<T>  s : () -> new ArrayList<Integer>()
void -> T

List<Integer> list = s.get()

s = ArrayList :: new 



# Functional Composition
=> bade function ko chhote chhote me tod do

int result = ((x+2)*3)
-> add 2
-> multiply 3

f(x) = x+2
g(x) = x*3
g(f(x))


1. Function<T,R>

T -> R
=> R apply(T t)

=> andThen()
=> compose()

=> andThen() :- Input me Function leta and output me bhi Function deta hai.

=>compose() ;- right to left (andThen() ka ulta).


=> Method pipeline ban jati hai in dono ke use se

=> We can use Method reference in both methods.



=> Predicate Chaining
1. and()
2. or()
3. negate()



=> Consumer Chanining
<T , void>

andThen()



=> BiFunction<T,U,R>
T U input
R output

=> BiConsumer<T,U>

=> BiPredicate<T,U>



=> Object Oriented Language is imparative.
means bata rahikaam kaise karna hai

=> Functional Prograing
is Declarative
=> karn akya hai only not kaise kar raha hai.