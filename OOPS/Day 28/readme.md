
// List<Integer> list = new ArrayList<>();
class Animal {

}
class Dog extends Animal {

}

List<Dog> dogs = new ArrayList<>();
List<Animal> animals = dogs; // not allowed in java
// Generics breaks parent child variable.
// Dog is a animal
// List<Dog> not any List<Animal>

Generic<A> is not subType of Generic<B>.

// If esa hota to type safety break ho jati.
// issue aa jata writing me Dog ki list me animal add ho jata
animals.add(new Animal());

// => Generics are invariant
If A is child of B 
then Generic<A> is not child of Generic<B>.

Dog[] dogs = new Dog[10];
Animal[] animal = dogs;
animal[3] = new Animal(); // runTime Error


// Generics me ye allow nahi hai to code likhne me problem jaise ek method printAnimal jo list expect karta hai Animal ki but hum usse Dog ki list ko print nahi kar sakte.
// is problem ka soln hai Wildcards.

List<?> list = new ArrayList<>();
// type runTime par pata lagega so hum isme write nahi kar sakte only read kar sakte Object type me.




# Type Eraser
=> Does JVM knows Generics

class Box<T> {
    T value;
}

// compile ke baad
class Box {
    Object value;
}
// is Byte code ko JVM run karta hai.

// how compile remove them.

Rules
1. If no Bound => Replace Object
2. If Bound then Replace with bounds
class Box<T extends Number> {
    T value;
} 
After compiling
Class Box {
    Number value;
}
3. Insert Casting automatically.
Class Box<T> {
    T value;
}
Box<Integer> boxes = new Box<>();
Integer x = boxes.get(0);
// after compiling
class Box {
    Object value;
}
Box b1 = new Box(5);
Integer x =(Integer) b1.get(0); // automatically add casting.

4. we can not use instance of operator in generics

List<String> l = new ArrayList<>();
if(l instance of List<String>){
    // can not write this
}

List l = new ArrayList<>()

5. Method overload nahi kar sakte
void print(List<String> l){

}
void print(List<Integer> l){

}
// after compiing same hi hoge

6. compiler generated bridge method

class Parent<T> {
    T get() {
        return null;
    }
}

class Child extends Parent<String> {
    @Override
    String get(){
        return "Hello";
    }
}

// After compiling
Method override nahi hoga alag method hogabecause method signature same nahi hota then new method bridge method khte hai usko


// why Type Eraser?
Generics introduce in Java 5.
existing system fail ho jata isilye compiler tak hi rakha ise jisse type safety ho jaye

// why Generics not supported Primitive
if allow hote then Object me convert hotaa but int koi class nahi hai use kaise Object replace kar sakta tha.