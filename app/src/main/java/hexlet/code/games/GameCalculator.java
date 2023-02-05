package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameCalculator {
    private static int num1;
    private static int num2;
    private static char getOperator () {
        Random randomChar = new Random();
        char[] expression = {'+', '-', '*'};
        int i = randomChar.nextInt(0, 3);
        return expression[i];
    }
    private static String intoStr (int result) {
        return String.valueOf(result);
    }
    public static void checkResults() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            Random rand = new Random();
            num1 = rand.nextInt(100);
            num2 = rand.nextInt(100);
            var operator = getOperator();
            var result = 0;
            if(operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            }
            questions[i] = "Question: " + num1 + " " + operator + " " + num2;
            results[i] = intoStr(result);
        }
        Engine.flow(questions, results, "What is the result of the expression?");
    }
}
