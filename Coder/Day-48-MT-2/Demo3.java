public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        Thread t1 = new Thread(() -> {
            System.out.println("Name of My Thread is "+ Thread.currentThread().getName());
            System.out.println("Id of MY Thread is "+Thread.currentThread().getId());

        });

        Thread t2 = new Thread(() -> {
            System.out.println("Name of My 2nd Thread is "+ Thread.currentThread().getName());
            System.out.println("Id of My 2nd Thread is "+Thread.currentThread().getId());

        });
        t1.start();
        t2.start();
    }
}

// Thread Id and Thread Name
