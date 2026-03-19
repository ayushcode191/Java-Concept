

public class Demo6 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
        v.breaks();
        Vehicle.fill();
    }
}

// After Java 8 ---> Default Mathods, static Method
// From Java 9 --> private method also allow -> only callable within interface.

// List Interface  --> If new Methods come then kya sab mejakar update karte rahege

interface Vehicle {
    void drive();
    default void breaks(){
        System.out.println("Breaking");
        stop();
    }

    static void fill() {
        System.out.println("Vehicle is filling");
    }

    private void stop(){
        System.out.println("Stopped");
    }
    
}

class Car implements Vehicle {
    @Override
    public void drive(){

    }
    @Override
    public void breaks(){
        System.out.println("Car is breaking");
    }
}
