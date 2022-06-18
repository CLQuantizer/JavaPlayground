import java.util.ArrayList;
import java.util.LinkedList;

class ArrayVersusLink {
    static long NUM = 50000;

    public static void main(String[] args) {

        ArrayList<Long> arrayList = new ArrayList<Long>();
        long arrayStart = System.currentTimeMillis();
        for (long i = 0; i < NUM; i++) {
            arrayList.add(0,i);
        }
        long arrayEnd = System.currentTimeMillis();
        System.out.println("Time used for ArrayList : "+(arrayEnd-arrayStart));

        LinkedList<Long> linkedList = new LinkedList<Long>();
        long linkedStart = System.currentTimeMillis();
        for (long i = 0; i < NUM; i++) {
            linkedList.add(0,i);
        }
        long linkedEnd = System.currentTimeMillis();
        System.out.println("Time used for LinkedList : "+(linkedEnd-linkedStart));

    }
}