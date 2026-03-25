public class Demo2 {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        System.out.println(b1.getValue());

        Box b2 = new Box("Hello");
        Box b3 = new Box(false);

        // System.out.println(b1.getValue()+5); // undefined error

        // Downcasting
        // Object -> too generic -> not know what op can performed
        Integer x = (Integer) b1.getValue();
        String s = (String) b2.getValue();
        Boolean b = (Boolean) b3.getValue();

        System.out.println(x+5);
        System.out.println(s+5);
        System.out.println(b);

        // server se value aaye to exception aa sakte hai

    }
}

// class Box {
//     private int value;

//     Box(int value){
//         this.value = value;
//     }

//     public int getValue() {
//         return value;
//     }

//     public void setValue(int value) {
//         this.value = value;
//     }
// }
// // Alag Alag class har ek ke liye
// class Box2 {
//     String value;
// }


class Box {
    private Object value;

    Box(Object value){
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
