

public class Demo3 {
    public static void main(String[] args) {

        /**
         
        try{
            System.out.println(5/0); // ArithmeticException
        }
        // catch(ArithmeticException e){
        //     System.out.println("Divide by zero is not allowed");
        // }
        // catch(RuntimeException e){
        //     System.out.println("Catched by Run Time Exception");
        // }
        catch(Exception e){
            System.out.println("Generic Exception occured");
        }
        // catch(Throwable e){ // This is not recommended as it may catch Error 
        //     System.out.println("Catched by Throwable");
        // }
        */

        /** 

        try{
            // System.out.println(5/0);
            // String s = null;
            // s.length();

            Object obj = "hello";
            Integer i = (Integer) obj;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero is not allowed");
        }
        catch(NullPointerException e){
            System.out.println("Nulls are not allowed");
        }

        // If i write this catch block before Arithemetic or NullPointer then compile time error occured unreachable catch statements
        catch(Exception e){
            System.out.println("Some generic Exception");
        }

        */

        try{
            // System.out.println(5/0);
            String s = null;
            s.length();
        }

        catch(ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }


    }
}

// top to down search for catch block
// Parent Catch block ko child catch block se upar nahi likh sakta in chain of catch block otherwise compilation error occured
// after Java 7 sibling Exception ka ek hi catch block me likh sakte hai
