public class Demo2 {
    // static boolean flag = false; // true

    static volatile boolean flag = false; 
    public static void main(String[] args) {
        

        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(1000);
            } catch(Exception e){}
            flag = true; // cache -> flag = true
        });

        Thread t2 = new Thread(() -> { // cache ---> flag --> false
            while(!flag){
                // System.out.println("Thread2 is running....."); // Synchronized -> ye value ko sidhe RAM se leti hai.

                // do nothing
            }

            System.out.println("Thread-2 finished");
        });

        t1.start();

        t2.start();
    }
    
}


/**
 * volatile keyoword -> varibale ko sidhe RAM se read and write karega 
 * 
 * Synchronized (Lock based) => ye bhi visiblity problem ko dur karta hai.
 * 
 * 
 * 
 */

