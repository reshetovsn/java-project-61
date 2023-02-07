package hexlet.code.games;

import hexlet.code.Engine;

public class GameEvenNumbers {
    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
    public static void checkEven() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            var randNum = (int)(Math.random() * 100);
            questions[i] = "Question: " + randNum;
            results[i] = isEven(randNum);
        }
        Engine.flow(questions, results, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
