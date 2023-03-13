package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        var sqr = Math.sqrt(number);
        for (int i = 2; i <= sqr; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runGame() {
        String[][] questionsAndResults = new String[Engine.ROUNDS][2];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Utils.getRandomNumber();
            questionsAndResults[i][0] = Integer.toString(randomNumber);
            questionsAndResults[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.flow(questionsAndResults, DESCRIPTION);
    }
}
