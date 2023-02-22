package hexlet.code;

import java.util.Random;

import static hexlet.code.Engine.getUpperBound;

public class Utils {

    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(getUpperBound());
    }

}
