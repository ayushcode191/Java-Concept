public class Demo {
    public static void main(String[] args){
        System.out.println("Main Thread strats");

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e){

        }

        System.out.println("Main Thread Ends");

    }
}

// Thread important methods
/**
 * Thread.sleep(milliseconds) -> TIMED_WAITING (LOCK KO RELEASE NAHI KARTI HAI)
 * RUNNABLE --> TIMED_WAITING --> RUNNABLE
 */