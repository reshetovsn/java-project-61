package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int UPPER_BOUNDS_FOR_RAND = 100;
    private static final int LOWER_BOUND = 1;
    private static final Random RAND = new Random();

    public static int getUpperBound() {
        return UPPER_BOUNDS_FOR_RAND;
    }

    public static int getRandomNumber() {
        return RAND.nextInt(getUpperBound());
    }

    public static int getRandomNumWithBounds() {
        return RAND.nextInt(LOWER_BOUND, getUpperBound());
    }
}
