import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.count);
        
        
    }
    
}

// Atomic Integer
class Counter {
    // int count = 0;
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        // count++;
        count.incrementAndGet(); // Atomic Operation
    }
}

// t1 & t2 -----> concurrently
// t1 & t2 ---> parallely (isme bhi race condition ko manage karta hai bina locking mechanism ke)
// answer always 20000

// CAS (Compare and Set)