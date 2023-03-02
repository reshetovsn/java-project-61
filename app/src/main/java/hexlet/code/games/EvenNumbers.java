package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenNumbers {
    public static boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }

    public static void runGame() {
        String[][] questionsAndResults = new String[Engine.getRounds()][2];
        for (var i = 0; i < Engine.getRounds(); i++) {
            var randomNumber = Utils.getRandomNumber();
            questionsAndResults[i][0] = "Question: " + randomNumber;
            questionsAndResults[i][1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.flow(questionsAndResults, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
