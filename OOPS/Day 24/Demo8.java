

public class Demo8 {
    public static void main(String[] args) {
        C c =  new C();
        c.fun();
    }
}

// Java Resolution Priority Rule => We give Priority to class method by default

interface A {
    default void fun() {
        System.out.println("Inside Interface A");
    }
}

class B {
    public void fun() {
        System.out.println("Inside B class");
    }
}

class C extends B implements A {

}