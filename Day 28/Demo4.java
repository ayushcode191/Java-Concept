
// Generics with Lower bound (super) -> Atleast animal and it's super types

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        fun(animals);
        
    }

    public static void fun(List<? super Animal> values){
        // writing allowed
        values.add(new Animal());
        values.add(new Dog());
        values.add(new LabraDog());

        // simple reading not allowed Object class se akr sakte 
        for(Object obj : values){
            Animal a = (Animal) obj;
            a.eat();
        }

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

class LabraDog extends Dog {

}

// counter variant

// PECS Rule 
// producer extends consumer super