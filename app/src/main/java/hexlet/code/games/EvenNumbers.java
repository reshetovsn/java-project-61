package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenNumbers {

    private static final int U_BOUND = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void runGame() {
        String[][] questionsAndResults = new String[Engine.ROUNDS][2];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            var randomNumber = Utils.getRandomNumber(U_BOUND);
            questionsAndResults[i][0] = Integer.toString(randomNumber);
            questionsAndResults[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.flow(questionsAndResults, DESCRIPTION);
    }
}
