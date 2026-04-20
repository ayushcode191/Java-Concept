

public class Demo2 {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 0;

        // System.out.println(a/b);
        
        methodA(a, b);
    }

    private static void methodA(int a,int b){
        methodB(a,b);
    }

    private static void methodB(int a,int b){
        System.out.println(a/b);
    }
}
// Default Exception handling
// ClassName.MethodName 