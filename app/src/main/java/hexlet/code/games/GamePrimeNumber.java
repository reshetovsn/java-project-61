package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GamePrimeNumber {
    private static int randomNumber;
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
            Random rand = new Random();
            randomNumber = rand.nextInt(Engine.getUpperBound());
            questions[i] = "Question: " + randomNumber;
            results[i] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.flow(questions, results, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
