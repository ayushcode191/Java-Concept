

public class Demo {
    public static void main(String[] args) {
        // Car c = new Thar();
        // c.drive();
    }
}


interface Car {
    void drive();
}

abstract class Thar implements Car {
    // @Override
    // public void drive() { // By defualt interface me public method hote hai to visisbilty reduce nahi kar sakte so public likhna hi padega.
    //     System.out.println("Thar is driving");
    // }

    abstract public void drive();
}

class BlackThar extends Thar {
    @Override
    public void drive(){

    }

}