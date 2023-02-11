package atomics;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static Integer counter = 0;
    private static AtomicInteger ac = new AtomicInteger(0);
    private static Atom at = new Atom(0);
    private static void increment(){
        counter++;
    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                         increment();
                         ac.incrementAndGet();
                         at.incrementAndGet();
            }
        };
        
        Thread[] threads = new Thread[20];
        for (int i = 0; i < 20; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
        
        for (int i = 0; i < 20; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Counter: " + counter);
        System.out.println("Counter: " + ac);
        System.out.println("Counter: " + at);
    }
}
