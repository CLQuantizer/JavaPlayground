import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FinalDemo {
    final static private List<Integer> finalList = new ArrayList<Integer>();
    static private List<Integer> nonFinalList = new ArrayList<Integer>();
    public static void main(String[] args) {
        finalList.add(1);
        finalList.add(2);
        nonFinalList.add(3);
        nonFinalList.add(4);
        System.out.println(finalList);
        // finalInteger=new Integer(1);
        nonFinalList = Arrays.asList(1,2,3,4);
        System.out.println(nonFinalList);
    }
}