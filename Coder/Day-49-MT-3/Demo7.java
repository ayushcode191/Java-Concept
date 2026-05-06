public class Demo7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Custom Thread running");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Custom Thread-2 running");
        });

        t1.start();
        t2.start();
        t1.setPriority(10);

        System.out.println(t1.getPriority());
    }
    
}


/**
 * Thread Priority  - indiaction only OS can ignore it.
 * MAX_PRIORITY = 10
 * MIN_PRIORITY = 1
 * NORM_PRIORITY = 5 (By default)
 * 
 * Depends on OS
 * -> may respect Priority
 * -> may partially respect
 * -> may not at all
 */