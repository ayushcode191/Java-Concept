public class Demo4 {
    public static void main(String[] args) {

        Test test = new Test();

        Thread t1 = new Thread(() -> test.m1());

        Thread t2 = new Thread(() -> test.m2());

        t1.start();

        t2.start();
    }
}

class Test {
    synchronized void m1(){
        System.out.println("m1 entered");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){}
        System.out.println("m1 exit");
    }

    synchronized void m2(){
       System.out.println("m2 entered");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){}
        System.out.println("m2 exit");
    }
}


// Agar t1 ne lock acquire kar liya and m1 me enter kar gaya  then t2 m2 ke liye bhi lock acquire nahi kar sakta jab tak t1 kiye hai because lock object par acquire hota hai

// => one object => one lock

// if same class ke two object hai to dono ke alag alag lock hoge 
// test1.m1() , test2.m2() => ek sath lock acquire kar sakte hai.

