package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class GameCalculator {

    private static char getOperator() {
        Random randomChar = new Random();
        char[] expression = {'+', '-', '*'};
        int i = randomChar.nextInt(0, expression.length);
        return expression[i];
    }

    private static char operator = getOperator();

    private static int getResult(int number1, int number2) {
        var result = 0;
        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        }
        return result;
    }

    public static void checkResults() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            int num1 = Utils.getRandomNumber();
            int num2 = Utils.getRandomNumber();
            questions[i] = "Question: " + num1 + " " + operator + " " + num2;
            results[i] = String.valueOf(getResult(num1, num2));
        }
        Engine.flow(questions, results, "What is the result of the expression?");
    }
}
