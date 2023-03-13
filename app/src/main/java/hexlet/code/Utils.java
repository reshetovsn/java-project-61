package hexlet.code;

import java.util.Random;

public class Utils {

    private static final Random RAND = new Random();

    public static int getRandomNumber(int uBound) {
        return RAND.nextInt(uBound);
    }

    public static int getRandomNumWithBounds(int lBound, int uBound) {
        return RAND.nextInt(lBound, uBound);
    }
}
