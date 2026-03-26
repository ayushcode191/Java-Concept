import java.util.ArrayList;
import java.util.List;

// wildcard with upper bounds (extends)
public class Demo3 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        fun(dogs);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);
    }

    // Atleast animal or it's subTypes
    static void fun(List<? extends Animal> values){
        for(Animal a : values){
            a.eat();
        }
        // we can not add in this also. because any subType List aa sakti hai usme koi aur subType kaise add ho sakta hai.

    }
}

class Animal {
    void eat(){
        System.out.println("Animal Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Barking");
    }
    @Override
    void eat(){
        System.out.println("Dog Eating");
    }
}
// covariant 