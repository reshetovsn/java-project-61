package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GameGCD {
    private static int num1;
    private static int num2;
    static final int LOWER_BOUND = 1;

    // convert integer result into string
    private static String intoStr(int result) {
        return String.valueOf(result);
    }
    public static void getNod() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            Random rand = new Random();
            num1 = rand.nextInt(LOWER_BOUND, Engine.getUpperBound());
            num2 = rand.nextInt(LOWER_BOUND, Engine.getUpperBound());
            questions[i] = "Question: " + num1 + " " + num2;
                // Make num1 always bigger then num2 //
                if (num2 > num1) {
                    var temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                var r = num1 % num2;
                // Euclid's algorithm //
                while (r != 0) {
                    num1 = num2;
                    num2 = r;
                    r = num1 % num2;
                }
                results[i] = intoStr(num2);
        }
        Engine.flow(questions, results, "Find the greatest common divisor of given numbers.");
    }
}
