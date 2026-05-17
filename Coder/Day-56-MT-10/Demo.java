import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        // Executor Framework

        ExecutorService executer  = Executors.newFixedThreadPool(2);
        
        // no of task = 5;
        for(int i=1;i<=5;i++){

            int taskId = i;

            executer.execute(() -> {
                System.out.println("Task "+ taskId + " is performed by "+ Thread.currentThread()
                    .getName());
            });
        }

        executer.shutdown();
        
    }
}