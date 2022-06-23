import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo {

    private volatile static int volatileNumber=0;
    private static AtomicInteger number=new AtomicInteger(0);
    private static int synchronizedNumber=0;
    synchronized public static void increment(){
        synchronizedNumber++;
    }
    private static int normalNumber=0;
    private static int MAGIC = 1000;
    private static class Writer extends Thread{
        @Override
        public void run(){
            for (int i = 0; i <MAGIC>>1; i++) {
                try {
                    Thread.sleep(0);
                    volatileNumber++;
                    normalNumber++;
                    number.incrementAndGet();
                    increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static class Reader extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(500);
                System.out.println("\nPrinting results:\n");
                System.out.println("Volatile number: "+volatileNumber);
                System.out.println("Atomic number: "+number.get());
                System.out.println("Normal number: "+normalNumber);
                System.out.println("Synchronized number: "+synchronizedNumber);
                System.out.println("---------------------------------\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Reader().start();
        new Writer().start();
        new Writer().start();
    }
}