package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static int getResult(int number1, int number2) {
        if (number2 > number1) {
            var temp = number1;
            number1 = number2;
            number2 = temp;
        }
        var r = number1 % number2;
        while (r != 0) {
            number1 = number2;
            number2 = r;
            r = number1 % number2;
        }
        return number2;
    }

    public static void runGame() {
        String[][] questionsAndResults = new String[Engine.getRounds()][2];
        for (var i = 0; i < Engine.getRounds(); i++) {
            int num1 = Utils.getRandomNumWithBounds();
            int num2 = Utils.getRandomNumWithBounds();
            questionsAndResults[i][0] = "Question: " + num1 + " " + num2;
            questionsAndResults[i][1] = String.valueOf(getResult(num1, num2));
        }
        Engine.flow(questionsAndResults, "Find the greatest common divisor of given numbers.");
    }
}
