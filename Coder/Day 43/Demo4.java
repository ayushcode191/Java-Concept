

public class Demo4 {
    public static void main(String[] args) {
        // Exception handling in chain of methods
        // methodA(5, 0);

        System.out.println("Step-1");
        try{
            methodA(5, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero is not allowed");
        }

    }

    private static void methodA(int a,int b){
        methodB(a,b);

        // try{
        //     methodB(a,b);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Divide by zero is not allowed");
        // }
    }

    private static void methodB(int a,int b){
        // try{
        //     System.out.println(a/b);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Divide by zero is not allowed");
        // }

        System.out.println(a/b);

        System.out.println("Step-2");  // -> Unreachable  line
        
    }
}

// main() ---> methodA() ----> methodB()