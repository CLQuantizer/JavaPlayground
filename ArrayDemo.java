import java.util.Arrays;
import java.util.List;

class ArrayDemo {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.asList(integerArray);
        
        //This can compile 
        intList.add(6);
    }

}