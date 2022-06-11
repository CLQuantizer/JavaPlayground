public class Volatile {

    private static int number=0;
    private static class Reader extends Thread {

        @Override
        public void run() {
            for(int i=0;i<10;i++){
                try{Thread.sleep(500);}catch(InterruptedException e){};
                number+=1;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Reader().start();
        for(int i=0;i<10;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){};
            System.out.println(number);
        }
    }
}