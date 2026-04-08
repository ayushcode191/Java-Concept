public class Demo5 {
    public static void main(String[] args) {
        String y = getResult("Hello");
        int z = getResult(10);
        printPair(10, "Hello"); // Type Inference -> By value


    }

    public static <T> T getResult(T x){ // <T> Type Parameter
        return x;
    }

    public static<T,U> void printPair(T first, U second){
        System.out.println(first +" "+second);
    }
}

// Generic Method
// <T> returnType methodName(T parameter)
