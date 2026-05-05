public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread starts");

        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(2000);
            } 
            catch(InterruptedException e){
                
            }
            System.out.println("Thread-0-starts");
        });

        t1.start();

        // t1.join();
        t1.join(2000); // let the t1 Thread first complete it's execution

        System.out.println("Main Thread Ends");
    }
}

// join()

/**
 * Main Thread ---> WAITING
 * t1 THREAD --> RUNNABLE --> TERMINATED
 * Main THREAD  ---> WAITING ---> RUNNABLE --> TERMINATED
 */
