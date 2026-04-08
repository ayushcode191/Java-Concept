import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        // fun(dogs); // not allowed

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        // fun(animals);

        // Both allowed
        fun2(animals);
        fun2(dogs);
    }

    static void fun(List<Animal> animals){
        for(Animal a : animals){
            a.eat();
        }
    }

    // but this is limited scope
    static void fun2(List<?> values){
        for(Object obj : values){
           System.out.println(obj.getClass().getName());
        }
        // values.add(10); // not allowed
        // we can only read via Object class reference

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
