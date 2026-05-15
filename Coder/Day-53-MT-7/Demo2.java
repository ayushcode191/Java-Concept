import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo2 {
    public static void main(String[] args) {

        SharedResource sr = new SharedResource();

        Thread r1 = new Thread(() -> sr.read());
        Thread r2 = new Thread(() -> sr.read());
        Thread r3 = new Thread(() -> sr.read());

        Thread w1 = new Thread(() -> sr.write(10));
        Thread w2 = new Thread(() -> sr.write(20));     
        Thread w3 = new Thread(() -> sr.write(30));

        r1.start();
        r2.start();
        r3.start();

        w1.start();
        w2.start();
        w3.start();
        
    }
}


class SharedResource {
    private int value = 0;

    ReadWriteLock rwLock = new ReentrantReadWriteLock();

    Lock rl = rwLock.readLock(); // shared lock for readers
    Lock wl = rwLock.writeLock(); // exclusive lock for writers

    

    public int read() {
        rl.lock();
        try {
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
            System.out.println(Thread.currentThread().getName() +" read value as " + value);
            return value;
        }
        finally{
            rl.unlock();
        }
    }

    public void write(int newValue) {
        wl.lock();

        try{
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
            }
            value = newValue;
            System.out.println(Thread.currentThread().getName() +" changes value to " + value);
        }
        finally{
            wl.unlock();
        }
    }


}


// Reader-Writer Problem: The reader-writer problem is a classic synchronization problem that involves coordinating access to a shared resource (like a database) between multiple readers and writers. The main challenge is to ensure that writers have exclusive access to the resource while allowing multiple readers to access it concurrently without interference.

// ReentrantReaderWriterLock: 