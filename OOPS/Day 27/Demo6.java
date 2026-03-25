public class Demo6 {
    public static void main(String[] args) {
        // Box<String> box1 = new Box<>(); not allow
        Box<Integer> b1 = new Box<>();
        b1.value = 5;
        b1.printDouble();

    }
}


// we want class should work only number related so Number class parent hai sare number related class ki
// Generic Bound
// Upper Bound -> T is atleast Number or it's subtype

class Box<T extends Number> {
    T value;

    public void printDouble(){
        System.out.println(value.doubleValue()); // we can not call it
    }
}
