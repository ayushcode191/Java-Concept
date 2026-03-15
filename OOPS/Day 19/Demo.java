
public class Demo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        
        Outer.Inner inner = new Outer.Inner(outer);
        // inner.fun(outer);
        inner.fun();

    }
}


// Static Nested Class
// can create object of inner class without creating the object of outer class as it is static
// Can not access to non static member of outer class.
// Can extend any class , can implement any inetrface , behae like normal class.
// Can have static Member.
// can use access modifier => have advntage also
class Outer {

    private static int x = 4;
    int y;

    static class Inner {

        private String name;
        private static int number;

        Outer outer;

        Inner(Outer outer){
            this.outer = outer;
        }

        // void fun(Outer outer){
        //     System.out.println("Hello ");
        //     System.out.println(x);
        //     // System.out.println(y); => give error
        //     System.out.println(outer.y);
        // }

        void fun(){
            System.out.println("Hello ");
            System.out.println(x);
            // System.out.println(y); => give error
            System.out.println(outer.y);
        }
    }
}




class BankAccount {

    //puri class isi ke andar sense bana rahi 
    private static class InterestCalculator {
        static double calculateYearly(double principal, double rate){
            return principal * rate;
        }

        
    }


    public double computeInterest (double principal){
        return InterestCalculator.calculateYearly(principal, 0.09);
    }
}



// use cases of static nested class
/**
 * As helper class for any outer class
 * Builder Design pattern
 * If you want to have static methods inside a nested class
 * Request/ Response DTO
 */

