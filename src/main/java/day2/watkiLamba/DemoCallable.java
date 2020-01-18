package day2.watkiLamba;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ExecutorService es = Executors.newSingleThreadExecutor();
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Integer> f1 = es.submit(() -> add(20,20));
        Future<Integer> f2 = es.submit(() -> add(10,21));
        int a = f1.get();
        int b = f2.get();
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        es.shutdown();
    }

    private static int add(int a, int b) {
        while (a>0) {
            System.out.print(".");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a--;
            b++;
        }
        return b;
    }
}
