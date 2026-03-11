// use of string argument in main method

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("No of arguments are "+args.length);

        for(int i=0;i<args.length;i++){
            System.out.println("Argument "+i+" = "+args[i]);
        }
    }
}
