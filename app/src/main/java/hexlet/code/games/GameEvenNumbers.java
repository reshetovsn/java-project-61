package hexlet.code.games;

import hexlet.code.Engine;

public class GameEvenNumbers {
    public static boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }

    public static void checkEven() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            var randNum = Engine.getRandomNumber();
            questions[i] = "Question: " + randNum;
            results[i] = isEven(randNum) ? "yes" : "no";
        }
        Engine.flow(questions, results, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
