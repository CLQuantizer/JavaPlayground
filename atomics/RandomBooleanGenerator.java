package atomics;

import java.util.Random;

public class RandomBooleanGenerator {
    public static boolean next(){
        return new Random().nextBoolean(); 
    }
}
