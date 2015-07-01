package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by johnsonj on 5/13/15.
 */
public class Driver {

    private static final long EXECUTOR_TIMEOUT = 15;

    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        executor.awaitTermination(EXECUTOR_TIMEOUT, TimeUnit.SECONDS);
        System.out.println("Finished all threads");
    }
}
