public class Demo2 {
    public static void main(String[] args) {
        // Outer try will handle inner Exception
        try{
            System.out.println("Outer try start");
            try{
                System.out.println("Inner try starts");

                System.out.println(5/0); // new ArithmeticException("/ by zero");

                System.out.println("Inner try ends");  

            }
            catch(NullPointerException e){
                System.out.println("Nulls are not allowed : Inner");
            }
            System.out.println("Outer try ends");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero not allowed : Outer");
        }

    }
}
