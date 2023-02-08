package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class GameProgression {
    private static int init;
    private static int step;
    private static int valueOfStep = 20;
    private static int progressionSize = 10;

    // convert integer result into string
    private static String intoStr(int result) {
        return String.valueOf(result);
    }
    // Create random array with arithmetic progression //
    private static int[] getArray() {
        Random rand = new Random();
        init = rand.nextInt(Engine.getUpperBound());
        step = rand.nextInt(1, valueOfStep);
        int[] progression = new int[progressionSize];
        var r = init;
        for (var i = 0; i < progressionSize; i++) {
            progression[i] = r;
             r = r + step;
        }
        return progression;
    }
    public static void getNumFromProgression() {
        String[] questions = new String[Engine.getRounds()];
        String[] results = new String[Engine.getRounds()];
        for (var i = 0; i < Engine.getRounds(); i++) {
            var array = getArray();
            Random randomElement = new Random();
            int e = randomElement.nextInt(0, progressionSize);
            results[i] = intoStr(array[e]); // chose a random element in array to swap it after to ".."
            array[e] = -1; // change to unreal element in array
            // convert int array into string PS couldn't find a better method
            String stringArray = Arrays.toString(array).replaceAll("\\[|]", "");
            var words = stringArray.split(", ");
            for (var ii = 0; ii < words.length; ii++) { // swap "-1" to ".." (according to the task)
                words[ii] = words[ii].equals("-1") ? ".." : words[ii];
            }
            questions[i] = "Question: " + String.join(" ", words);
        }
        Engine.flow(questions, results, "What number is missing in the progression?");
    }
}
