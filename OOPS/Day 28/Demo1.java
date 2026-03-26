import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        // Invariant in generics
        // Animal animal = new Dog();
        // animal.eat();
        // animal.walk();

        // animal.bark(); // not allowed

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs; // not allowed

        // Array covariant so not safe
        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Animal();

        for(Animal animal: animals){
            if(animal==null) continue;
            animal.eat();
        }
        

    }
}

class Animal {
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Barking");
    }
}

