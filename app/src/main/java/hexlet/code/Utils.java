package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RAND = new Random();
    private static final int U_BOUND = 100;
    private static final int L_BOUND = 1;
    private static final int L_BOUND_FOR_PROGRESSION = 5;
    private static final int PROGRESSION_MAX_SIZE = 10;

    public static int getRandomNumber() {
        return RAND.nextInt(U_BOUND);
    }

    public static int getRandomNumWithBounds() {
        return RAND.nextInt(L_BOUND, U_BOUND);
    }

    public static int getProgressionSize() {
        return RAND.nextInt(L_BOUND_FOR_PROGRESSION, PROGRESSION_MAX_SIZE);
    }
}
