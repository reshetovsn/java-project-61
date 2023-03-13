package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Calculator {
    private static final String DESCRIPTION = "What is the result of the expression?";

    private static char getOperator() {
        Random randomChar = new Random();
        char[] expression = {'+', '-', '*'};
        int i = randomChar.nextInt(0, expression.length);
        return expression[i];
    }

    private static int getResult(int number1, int number2, char chOperator) {
        var result = 0;
        if (chOperator == '+') {
            result = number1 + number2;
        } else if (chOperator == '-') {
            result = number1 - number2;
        } else if (chOperator == '*') {
            result = number1 * number2;
        }
        return result;
    }

    public static void runGame() {
        String[][] questionsAndResults = new String[Engine.ROUNDS][2];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            char operator = getOperator();
            int num1 = Utils.getRandomNumber();
            int num2 = Utils.getRandomNumber();
            questionsAndResults[i][0] = "Question: " + num1 + " " + operator + " " + num2;
            questionsAndResults[i][1] = String.valueOf(getResult(num1, num2, operator));
        }
        Engine.flow(questionsAndResults, DESCRIPTION);
    }
}
