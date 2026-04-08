
public class Demo4 {
    
}

// Multiple Interface => not support through class , allow through interface

interface A {
    void fun();
}

interface B {
    void fun2();
}

class C implements A, B {
    @Override 
    public void fun(){

    }
    @Override
    public void fun2(){

    }

}
