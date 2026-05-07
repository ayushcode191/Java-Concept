public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=1;i<=10000;i++){
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1;i<=10000;i++){
                c1.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c1.count);

    }
}

class Counter {
    public int count = 0;

    // synchronized  void increment(){
    //     // normal code that not need synchronized
    //     count++; // 3 increment
    // } 

    void increment(){
        // normal code that not need synchronized

        synchronized(this){
            count++; // 3 increment
        }
        
    } 
}

