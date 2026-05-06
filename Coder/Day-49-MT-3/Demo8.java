public class Demo8 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Running...");
            }
        });


        t1.setDaemon(true);

        t1.start();

        try{
            Thread.sleep(2000);
        }
        catch(Exception e){}

        return;

    }
    
}


/**
 * Daeomn Threads --> Background running Threads
 * 
 * --> Stop immediately once Main Thread is completed. (Normally User Thread execute hote rahte Main Thread ke complete hone ke baad bhi)
 * 
 * Threads -> User Threads, Daemon Threads
 * 
 * Garbage Collection ----> Daemon Threads
 */