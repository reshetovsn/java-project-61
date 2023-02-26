package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int UPPER_BOUND = 100;
    private static final int LOWER_BOUND = 1;
    private static final Random RAND = new Random();

    public static int getRandomNumber() {
        return RAND.nextInt(UPPER_BOUND);
    }

    public static int getRandomNumWithBounds() {
        return RAND.nextInt(LOWER_BOUND, UPPER_BOUND);
    }
}
