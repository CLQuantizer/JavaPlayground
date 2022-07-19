import java.util.concurrent.*;
import java.util.*;
class ExecutorDemo{
    public static void main(String[] args){
	ThreadFactory f= new ThreadFactory(){
            public Thread newThread(Runnable r){
	        return new Thread(r);
	    }
	};
	BlockingQueue<Runnable> q = new ArrayBlockingQueue<>(5);
        ThreadPoolExecutor TPE = new ThreadPoolExecutor(5,10,1000,TimeUnit.MILLISECONDS,q,f);
        return;
    }
}
