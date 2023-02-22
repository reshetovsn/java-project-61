package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

import java.util.Random;

public class GameProgression {
    private static final int VALUE_OF_STEP = 20;
    private static final int PROGRESSION_SIZE = 10;

    private static int[] getArray() {
        Random rand = new Random();
        int init = Utils.getUpperBound();
        int step = rand.nextInt(1, VALUE_OF_STEP);
        int[] progression = new int[PROGRESSION_SIZE];
        var r = init;
        for (var i = 0; i < PROGRESSION_SIZE; i++) {
            progression[i] = r;
             r = r + step;
        }
        return progression;
    }

    private static int getResult(int[] progression) {
        Random randomElement = new Random();
        int e = randomElement.nextInt(0, PROGRESSION_SIZE);
        return progression[e];
    }

    public static void getNumFromProgression() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            var array = getArray();
            int result = getResult(array);
            results[i] = String.valueOf(result); // choose a random element in array to swap it after
//            result = -1; // change to unreal element in array
            // convert array into string without "[" & "]"
            String stringArray = Arrays.toString(array).replaceAll("\\[|]", "");
            String[] words = stringArray.split(", ");
            for (var ii = 0; ii < words.length; ii++) { // swap "-1" for ".."
                words[ii] = words[ii].equals(String.valueOf(result)) ? ".." : words[ii];
            }
            questions[i] = "Question: " + String.join(" ", words);
        }
        Engine.flow(questions, results, "What number is missing in the progression?");
    }
}
