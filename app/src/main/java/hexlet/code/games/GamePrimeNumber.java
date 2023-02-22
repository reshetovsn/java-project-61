package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GamePrimeNumber {

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

    public static void checkPrime() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            int randomNumber = Utils.getRandomNumber();
            questions[i] = "Question: " + randomNumber;
            results[i] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.flow(questions, results, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
