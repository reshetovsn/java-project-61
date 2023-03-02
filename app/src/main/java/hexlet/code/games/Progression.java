package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;
import java.util.Random;

public class Progression {

    private static int[] getArray(int initNumber, int step, int size) {
        int[] progression = new int[size];
        var r = initNumber;
        for (var i = 0; i < size; i++) {
            progression[i] = r;
             r = r + step;
        }
        return progression;
    }

    private static int getResult(int[] progression) {
        Random randomElement = new Random();
        int e = randomElement.nextInt(0, progression.length);
        return progression[e];
    }

    public static void runGame() {
        String[][] questions = new String[Engine.getRounds()][2];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            int init = Utils.getRandomNumber();
            int step = Utils.getRandomNumWithBounds();
            int progressionSize = Utils.getProgressionSize();
            int[] array = getArray(init, step, progressionSize);
            int result = getResult(array);
            String stringArray = Arrays.toString(array).replaceAll("\\[|]", "");
            String[] words = stringArray.split(", ");
            for (var ii = 0; ii < words.length; ii++) {
                words[ii] = words[ii].equals(String.valueOf(result)) ? ".." : words[ii];
            }
            questions[i][0] = "Question: " + String.join(" ", words);
            results[i] = String.valueOf(result);
        }
        Engine.flow(questions, results, "What number is missing in the progression?");
    }
}
