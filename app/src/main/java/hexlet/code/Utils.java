package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int UPPER_BOUNDS_FOR_RAND = 100;
    private static final int LOWER_BOUND = 1;
    static Random rand = new Random();

    public static int getUpperBound() {
        return UPPER_BOUNDS_FOR_RAND;
    }

    public static int getRandomNumber() {
        return rand.nextInt(getUpperBound());
    }

    public static int getRandomNumWithBounds() {
        return rand.nextInt(LOWER_BOUND, getUpperBound());
    }
}
