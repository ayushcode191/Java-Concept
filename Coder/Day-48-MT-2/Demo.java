public class Demo {
    public static void main(String[] args) {
        // Threads
        MyThread t1 = new MyThread();
        t1.start();
        // main
    }
}


class MyThread extends Thread {
    @override
    public void run() {
        System.out.println("Thread is running");
    }

}


/*
t1.start() => JVM asks OS to create a new Thread -> Thread gets Stack/PC space.
Thread execute run()
 */

// Indirectly implememting the runnable interface.

// Creating a Thread


