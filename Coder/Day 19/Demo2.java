// Inner Class

public class Demo2 {
    public static void main(String[] args) {

        Outer outer = new Outer();

        // // Outer.Inner inner = new Outer.Inner(); => give error

        Outer.Inner inner = outer.new Inner();

        // Outer.Inner inner = new Outer().new Inner();
        inner.fun();
        // inner.fun2();
        Outer.Inner.fun2();

    }
}

class Outer {

    int x = 10;
    class Inner {
        int x = 20;

        // Outer outer => compiler apne aap se likh deta hai
        void fun(){
            System.out.println(x); // 20
            System.out.println(Outer.this.x);
            System.out.println("Hello");
        }

        static void fun2(){
            System.out.println("Hlo");
        }

        
    }
}
