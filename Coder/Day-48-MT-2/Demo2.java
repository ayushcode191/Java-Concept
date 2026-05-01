public class Demo2 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        // Thread t1 = new Thread(r1);
        Thread t1 = new Thread(() -> System.out.println("Thread is running"));
        
        t1.start();
    }
}

// Thread using Runnable Interface
class MyRunnable implements Runnable {
    @override
    public void run() {
        System.out.println("My Thread is running");
    }
}


// Defining a task
// Prefer ye karte hai.
// we can implements multiple interface and extend any class also
// Sepration of concern
// Reusibility
// Functional Interface => we can use lambda