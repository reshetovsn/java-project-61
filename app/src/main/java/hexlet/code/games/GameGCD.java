package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameGCD {

    private static int getResult(int number1, int number2) {
        // Make num1 always bigger then num2 //
        if (number2 > number1) {
            var temp = number1;
            number1 = number2;
            number2 = temp;
        }
        var r = number1 % number2;
        // Euclid's algorithm //
        while (r != 0) {
            number1 = number2;
            number2 = r;
            r = number1 % number2;
        }
        return number2;
    }

    public static void getNod() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            int num1 = Utils.getRandomNumWithBounds();
            int num2 = Utils.getRandomNumWithBounds();
            questions[i] = "Question: " + num1 + " " + num2;
            results[i] = String.valueOf(getResult(num1, num2));
        }
        Engine.flow(questions, results, "Find the greatest common divisor of given numbers.");
    }
}
