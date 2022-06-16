import java.util.concurrent.atomic.AtomicInteger;

public class Lock{   
    private static int value1 = 0;
    private static AtomicInteger value2 = new AtomicInteger(0);

    private static int value3=0;
    private static synchronized void increaseValue3() {
        value3++;
    }
    public static void main(String[] args) throws Exception{
        for(int i=0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    value1++;
                    value2.getAndDecrement();
                    increaseValue3();
                }
            }).start();
        }
        Thread.sleep(100);
        System.out.println("Thread not safe value1="+value1);
        System.out.println("AtomicInteger="+value2);
        System.out.println("Synchronized="+value3);
    }
    
}