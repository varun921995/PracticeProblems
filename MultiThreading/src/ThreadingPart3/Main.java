package ThreadingPart3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        System.out.println("Threading part 3");

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<String> callable = new MyCallable();

        Future<String> future = executor.submit(callable);

        try{
            System.out.println(future.get());
        }catch (Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }finally {
            executor.shutdown();
        }
    }
}
