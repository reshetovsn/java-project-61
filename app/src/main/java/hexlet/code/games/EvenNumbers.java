package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenNumbers {
    public static boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }

    public static void runGame() {
        String[][] questions = new String[Engine.getRounds()][2];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            var randomNumber = Utils.getRandomNumber();
            questions[i][0] = "Question: " + randomNumber;
            results[i] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.flow(questions, results, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
