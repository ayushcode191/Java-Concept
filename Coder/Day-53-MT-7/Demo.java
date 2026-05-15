import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    public static void main(String[] args) {

        Resource r1 = new Resource();

        Thread t1 = new Thread(() -> r1.f1());

        Thread t2 = new Thread(() -> r1.f1());

        Thread t3 = new Thread(() -> r1.f1());

        t1.start();
        t2.start(); 
        t3.start();
        
    }
}

class Resource {

    Lock lock = new ReentrantLock();

    void f1() {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " entered");

        try{
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){

            }

            System.out.println(Thread.currentThread().getName() + " exited");
        }

        finally{
            lock.unlock();
        }
    }
}

// Reentrant Lock: A reentrant lock is a synchronization mechanism that allows a thread to acquire the same lock multiple times without causing a deadlock. It is also known as a recursive lock. In Java, the ReentrantLock class from the java.util.concurrent.locks package provides this functionality.