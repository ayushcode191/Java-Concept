public class Demo6 {
    public static void main(String[] args) {
        // Thread new stage

        Thread mainThread = Thread.currentThread();

        Thread t1 = new Thread(() -> {
            System.out.println("Name of Current thread is "+ Thread.currentThread().getName());
            System.out.println("Main Thread State "+ mainThread.getState());
        });

        System.out.println(t1.getState()); //new 

        // Runnable stage
        t1.start();
        System.out.println(t1.getState()); // Runnable or terminated
        // System.out.println(t1.getState());
        // System.out.println(t1.getState());
        // System.out.println(t1.getState());
        // System.out.println(t1.getState());
        // System.out.println(t1.getState());

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            
        }

        System.out.println(t1.getState());

    }
}

//Thread life cycle