

public class Demo3 {
    public static void main(String[] args) {
        // Exception handling

        System.out.println("Step-1");
        try {
            int a = 5;
            int b = 0;

            System.out.println(a/b); // illegal --> new ArithmeticException("/ by zero")
            // Risky code
        }
        catch(ArithmeticException e){
            // System.out.println("Division by zero is not allowed");
            //System.out.println(e.getMessage());
            e.printStackTrace();

            // handling code
        }

        finally{
            // this always runs 

            // cleanup code
            // Resource close vagera karne ke liye
            // Log ka kaam kar sakte hai.
        }

        System.out.println("Step-2");
    }
}

// try-catch is diffrent form if-else (Preventive)
// If sahi se hanle nahi kiya to normal JVM handle karega 
// we can also use multiple catch block 
// finally block is optional
// catch block is also optional.

// try{

// }
// finally{

// }
// => is case me finally execute hoga 