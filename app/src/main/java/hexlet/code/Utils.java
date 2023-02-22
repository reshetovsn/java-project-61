package hexlet.code;

import java.util.Random;

public class Utils {

    static final int LOWER_BOUND = 1;
    static Random rand = new Random();

    public static int getRandomNumber() {
        return rand.nextInt(Engine.getUpperBound());
    }

    public static int getRandomNumWithBounds() {
        return rand.nextInt(LOWER_BOUND, Engine.getUpperBound());
    }
}
