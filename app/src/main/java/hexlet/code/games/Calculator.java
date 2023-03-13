package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Calculator {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char SUM = '+';
    private static final char DIFF = '-';
    private static final char MULTIPLY = '*';

    private static char getOperator() {
        Random randomChar = new Random();
        char[] expression = {'+', '-', '*'};
        int i = randomChar.nextInt(0, expression.length);
        return expression[i];
    }

    private static int getResult(int number1, int number2, char chOperator) {
        var result = 0;
        switch (chOperator) {
            case SUM -> result = number1 + number2;
            case DIFF -> result = number1 - number2;
            case MULTIPLY -> result = number1 * number2;
            default -> throw new RuntimeException("Unknown operator:" + chOperator);
        }
        return result;
    }

    public static void runGame() {
        String[][] questionsAndResults = new String[Engine.getRounds()][2];
        for (var i = 0; i < Engine.getRounds(); i++) {
            char operator = getOperator();
            int num1 = Utils.getRandomNumber();
            int num2 = Utils.getRandomNumber();
            questionsAndResults[i][0] = "Question: " + num1 + " " + operator + " " + num2;
            questionsAndResults[i][1] = String.valueOf(getResult(num1, num2, operator));
        }
        Engine.flow(questionsAndResults, DESCRIPTION);
    }
}
