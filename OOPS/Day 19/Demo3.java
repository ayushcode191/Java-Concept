// Local class =>very less use

public class Demo3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}

// Effective final variable


class Outer {

    private int x = 4;
    static private int y = 5;
    void greet() {
        // System.out.println("Hello");
        int z = 5;
        // z++; => can't be change => Effectively final 
        class Local {
            void sayHello(){
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
                System.out.println("Hello");
            }

        }

        Local local = new Local();
        local.sayHello();
    }
}

/**
 * Constructor
 * Method
 * If
 * Loop
 * Static Block
 */

// why local varibale must be effectively final such as z above
// => local class ke andar int z = 10 rakh dega apne app se and jab hum change kar denge to dubara me ambiguity hogi baar baar pir se vapas change hoga isilye jaav alllow nahi karta => must be effectively final

