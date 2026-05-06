public class Demo4 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            while (Thread.currentThread().isInterrupted()) {
                System.out.println("Running");
            }
            
        });

        t1.start();
        Thread.sleep(2000);

        t1.interrupt();

    }
}

/**
 * THread ---> interrupt flag (default false)
 * t1.interrupt() ---> sends a signal to t1 thread that it should stop doing what its doing.
 * 
 * we can gracefully handle.
 * => You can make a Thread untill a condition.
 * => Cancelling a long running task.
 * => use to stop Thread Pool.
 * 
 * isInterrupted():- return interrupt flag value
 * interrupted():- return interrupt flasg value and also set it's value  back to false
 * 
 * => sleep() , join(), wait(): TIMED_WAIING or WAITING incases me interrupt call karne par Exception throw karta hai. Checked Exception
 * 
 * 
 * 
 */