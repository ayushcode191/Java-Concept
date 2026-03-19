

public class Demo3 {
    public static void main(String[] args) {
        // Random r1 = new Random();
        // r1.fun();
        // MathConstant r2 = new Random();
        // // r2.fun(); // error but when we decalre in interface
        // r2.fun();

        System.out.println(MathConstant.PI_VALUE);



    }
}

// variable inside interface

interface MathConstant {
    // Always public static final
    double PI_VALUE = 3.14;
    int VALUE = 10;
    
    // void fun();
}

class Random implements MathConstant {
    // @Override
    // public void fun(){
    //     System.out.println(PI_VALUE);
    // }
}
