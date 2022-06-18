import java.util.concurrent.atomic.AtomicInteger;

public class Volatile {

    private static AtomicInteger number=new AtomicInteger(0);
    private static class Reader extends Thread {
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                try{Thread.sleep(5);}catch(InterruptedException e){};
                number.incrementAndGet();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Reader().start();
        for(int i=0;i<10;i++){
            try{Thread.sleep(5);}catch(InterruptedException e){};
            System.out.println(number);
        }
    }
}