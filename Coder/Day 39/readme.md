# Streams in Java
A Stream is a tool for processing a sequence of data through a chain of operations.

=> water pipeline:- many filters between.

Java Stream -> is not for Collecting the data, it is for Data Processing.

=> wrapper ki tarah kaam karta hai. alag se storage/ Collection nahi banta hai.

=> Internally SplitIterator usekarta hai.


=> Stream Pipeline Architecture

Source ----> Intermediate Operation -----> Terminal Operation


list.stream()   ----> Source
    .filter(x -> x>10) ---> Intermediate Operation
    .map(x -> x*x)   ////
    .toList()  ---> Terminal Operation



1. Source:- Collection, Array, Stream.of(), Infinite Stream



2. Intermediate Operation (Transformation):- 
filter(Predicate)
map(Function)
sorted()
distinct()
limit()
skip()
etc.

// list.stream() => Stream Type ka object banata hai.
Stream<Integer> s = list.stream()
ye sare Intermidiae operation Stream Type ka Object return karta hai. and ye sare operations Stream Class ke hi hai.



3. Terminal Operation:- 
forEach()
toList()
collect()
count()
findFirst()


=> If no terminal Operation :- No Stream executed.
=> It is Lazy Loading.

means 

list = [5,12,7,20];

list.stream()
    .filter(x -> x > 10)
    .map(x -> x*2)
    .toList()

=> ek element aayega vo sare filter se jayega and then next element => It is called vertical processing.

=> Lazy Evaluation :- If terminal operation nahi hoga then stream processing start hi nahi hoga, so it is called lazy loading.

=> Short circuiting :- if findFirst() hoga then ek element mil jayega to bahi ruk jayegi break lag jayega.



Stream<Integer> s = list.stream()

s.forEach(System.out:: println)

ab hum s ko dobara use nahi kar sakte means ek baar terminal operation lagne ke baad stream dead ho jati hai. dusri baar use nahi kar sakte hai.


=> Stream can be created from Collection, Array, Stream.of(), Infinite stream9()


=> list.parallelStream()


=> Array of String

String[] arr = ["ass","asss", "asdr"]

Stream<String> s = arr.stream();

Stream<String> s = Stream.of(1,2,5,8,3)

Empty Stream
Stream.empty()

Infinite Stream:- Iterate or generate two method are there

// dependence on previous value
Stream.iterate(sead, nextFn)

Stream.iterate(1, x -> x+1)
    .limit(100)
    .forEach(System.out::println)

// Independent 
Stream.generate(Supplier)

Stream.generate(Math::random)




=> Primitive Stream

Stream<Integer> s = list.stream()
                        .filter(x -> x>10)
                        .map(x -> x*2)

// again and again autoboxing hogi

1. IntStream
2. LongStream
3. DoubleStream()


IntStream s = IntStream.of(1,3,5)


                BaseStream<T> (I)
                     :
                     :
                     :
    Stream        IntStream      LongStream   DoubleStream



// verticle Loading hoti hai in Stream

Object -> primitive

Stream<Integer> s = list.stream()
IntStream st = s.mapToInt();

IntStream st = IntStream.of(1,2,4);
Stream<Integer> s = st.boxed()


Primitive to Primitive

IntStream s = IntStream.of(1,2,3,4);
LongStream s1 = s.mapToLong(x -> x);
DoubleStream s2 = s.mapToDouble(x -> x);
