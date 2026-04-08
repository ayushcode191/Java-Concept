
public class Demo2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x = 4;
        System.out.println(x);

        final int y;
        y = 4;
        System.out.println(y);

    }


}

class Random {
    // final double PI = 3.14;

    final double PI; // yaha only decalaration allowed hai because object creation ke time hi to varibale assign hoga

    Random(){
        this.PI = 3.14;
    }
}

class Random1 {
    // static final double PI = 3.14;

    static final double PI; 

    static {
        PI = 3.14;
    }
}
