public class Demo4 {
    public static void main(String[] args) {
        Animal a = new Dog("Dolu");
        a.makeSound();
    }
}

abstract class Animal {
    String name;
    static String type;
    Animal(String name){
        this.name = name;
    }
    abstract void makeSound();

    void sleep(){
        System.out.println("Sleeping");
    }

    static void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    Dog(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Making barking sound");
    }
}


// abstract class
// 1. Can't be instantiated directly.
// 2. can contain abstract method (method without implementation)
// 3. Can also contain normal method
// 4. Is meant to be extended


// Interview Question
// 1. Can abstract class have constructor ? 
// => Yes allowed work when object of child created.

//2. Can abstract class be final ?
// => not allowed because can't be inherited

// 3. Can abstract class have static method and static variable
// => Yes both static block also

// 4. Can abstract class have private method?
// => Yes allowed but it can't be abstract method.

// 5. Can abstract classes have final methods?
// => Yes allowed but it can't be abstract method.

// 6. Can abstract classes have no abstract method?
// => Yes.
