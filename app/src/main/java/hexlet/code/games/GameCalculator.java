package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class GameCalculator {
    private static int num1;
    private static int num2;

    private static char getOperator() {
        Random randomChar = new Random();
        char[] expression = {'+', '-', '*'};
        int i = randomChar.nextInt(0, expression.length);
        return expression[i];
    }

    private static char operator = getOperator();

    private static int getResult() {
        var result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        }
        return result;
    }

    public static void checkResults() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            num1 = Utils.getRandomNumber();
            num2 = Utils.getRandomNumber();
            questions[i] = "Question: " + num1 + " " + operator + " " + num2;
            results[i] = String.valueOf(getResult());
        }
        Engine.flow(questions, results, "What is the result of the expression?");
    }
}
