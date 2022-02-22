package Task4;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Task4 implements ExecutorService {

    ExecutorService execServ;

    public Task4(int treadCount){//constructor with the count of Treads
        execServ= Executors.newFixedThreadPool(treadCount);
    }


    @Override
    public void shutdown() {
        execServ.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return execServ.shutdownNow();
    }

    @Override
    public boolean isShutdown() {
        return execServ.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return execServ.isTerminated();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return execServ.awaitTermination(timeout,unit);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return execServ.submit(task);
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return execServ.submit(task, result);
    }

    @Override
    public Future<?> submit(Runnable task) {
        return execServ.submit(task);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        return execServ.invokeAll(tasks);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return execServ.invokeAll(tasks,timeout,unit);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        return execServ.invokeAny(tasks);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return execServ.invokeAny(tasks);
    }

    @Override
    public void execute(Runnable command) {
                execServ.execute(command);
    }

    public static void main(String[] args){
//        ExecutorService executorService =
//                Executors.newSingleThreadExecutor();
//        executorService.submit(() -> {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("We run it");
//        });
//        executorService.submit(() -> System.out.println("Start"));
      Task4 execServ= new Task4(1);
      execServ.submit(()->{
          try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
      execServ.submit(()->System.out.println("Start"));

    }
}
