package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final int U_BOUND = 100;
    private static final String DESCRIPTION = "What is the result of the expression?";

    private static char returnOperator() {
        char[] expression = {'+', '-', '*'};
        int i = Utils.getRandomNumWithBounds(0, expression.length);
        return expression[i];
    }

    private static int returnResult(int number1, int number2, char chOperator) {
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
            char operator = returnOperator();
            int num1 = Utils.getRandomNumber(U_BOUND);
            int num2 = Utils.getRandomNumber(U_BOUND);
            questionsAndResults[i][0] = num1 + " " + operator + " " + num2;
            questionsAndResults[i][1] = String.valueOf(returnResult(num1, num2, operator));
        }
        Engine.flow(questionsAndResults, DESCRIPTION);
    }
}
