public class Demo7 {
    public static void main(String[] args) {
        Box<Fish> b1 = new Box();
        // Box<Dog> b2 = new Box(); // error
    }
}


class Box<T extends Animal & Swimmable> {

} 

class Animal {
    void display(){
        System.out.println("Display Animal");
    }
}

interface Swimmable {
    void swim();
}

class Dog extends Animal {

}

class Fish extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println();
    }
}

// <T extends class & interface1, interface2 ..> 