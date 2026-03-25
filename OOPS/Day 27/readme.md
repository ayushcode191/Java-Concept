# Java Generics

=> Type Safety
=> Types tells whuch type of operation we can perform on that type of objects. so we can not access in wrong way.

=> UpCasting and DownCasting
=> upcasting:-
Class Animal {

}
class Dog extends Animal {
     
}
we can write
Animal a = new Dog();
we can call only that method that are in Animal not that those are only in Dog.

Ex: Dog d = new Dog();
Animal a = d;

so special class to general class called upcasting.
String s = "Hello";
Object obj = s; // upcasting

int x = 5;
long l = x; // upcasting

=> DownCasting
Object obj = "Hello";
String s = obj; // compiler error
String s = (String) obj; // downcasting

Object obj = 10;
String s = (String) obj; // ClassCastException


// Limitation of using Object as universal Type
=> Type information is lost.
=> wrong object can be invoked.
=> Casting become necessary when reading.
=> Many errors shift to runTime.

=> Solution is Generic