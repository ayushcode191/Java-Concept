
public class Demo {
    public static void main(String[] args) {

        // Inner try handle it's own Exception
        try{
            System.out.println("Outer try start");
            try{
                System.out.println("Inner try starts");

                System.out.println(5/0); // new ArithmeticException("/ by zero");

                System.out.println("Inner try ends");  

            }
            catch(ArithmeticException e){
                System.out.println("Divide by zero not allowed : Inner");
            }
            System.out.println("Outer try ends");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero not allowed : Outer");
        }
    }
}
