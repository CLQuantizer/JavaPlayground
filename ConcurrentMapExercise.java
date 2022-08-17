import java.util.concurrent.*;
import java.util.*;

class ConcurrentMapExercise{
    private static int MAGIC = 1;
    private static ConcurrentMap<Integer, Integer> map = new ConcurrentHashMap<>();  
    private static Map<Integer, Integer> normalMap = new HashMap<>();
    private static class Writer extends Thread{
        @Override
        public void run(){
            map.compute(0,(k,v)->v+1);
            normalMap.compute(0,(k,v)->v+1);
        }
    }
    public static void main(String[] args) throws InterruptedException{    
        for(int i=0; i<MAGIC; i++){
            map.put(i,0);
            normalMap.put(i,0);
        }
        for(int i=0; i<100; i++){
            new Writer().start();
        }
        Thread.sleep(500);
        map.forEach((k,v) -> System.out.println("key:" + k + " value:" + v));
        normalMap.forEach((k,v) -> System.out.println("key:" + k + " value:" + v));
    }
    
}
