# Functional Interface & Lambdas & Comparator Interface

=> Java is Object oriented language.
=> Everything is object.
=> Behavior (Function) related to object.
=> We want direct behavior.

=> So functional interface => Lambda Expression.

=> Behavior/Logic ko pass kar pau as an argument in another function.

=> Why do we need behavior passing?

class Student {
    String name;
    int rollNo;
    int marks;
}

list Student Ki inhe sort karna hai. but kis basis par sort karna hai.
=> Comparable interface ko implement kare Student Class and compareTo() method ko override kare.
=> But hame alag alag tarike se implement karna hai .
=> so hum Comparator interface ko use karte hai.and isko seprate rakhte hai Student class ke andar nahi jisse jyada ek hi class ki responsibility jyada na ho.

Comparator<T> {
    compare(T o1, T o2);
}

// we can create diffrent compare for diffrent types of sorting
// sort by names {

}
// sort by Marks{

}


=> But I just need to tell a method
=> How to do something.
=> But Ineed to wrap that "How".
=> In a box and then give to that method.

=> Problem Solved by Functional Interface
=> That contain only one abstract method. but can contain any no of default & Static method.
Ex:- Comparable, Comparator


=> Lambdas => Enables Functional Programming.

# Lambda Expression

(Parameter) -> expression
-> : Map to / Gives to

(s1,s2) -> s1.marks - s2.marks;

// Multiple Parameter
(a,b) -> a+b;

int sum(a,b){
    return a+b;
}

// single Parameter
x -> x*x;

// No Parameter
() -> System.out.println("Hello);

// MultiLine Lambda => avoid karte hai isko.
(a,b) -> {
    int sum = a+b;
    return sum;
}


=> How Java knows it?
From the current context.
=> Target Typing.

=> Why only F I => only one abstract method so Java knows ki kon si methiod ki implementation hai vo.

=> We can create our own functional interface => By creating only one abstract method.

=> By annotation @FunctionalInterface => It is optional.