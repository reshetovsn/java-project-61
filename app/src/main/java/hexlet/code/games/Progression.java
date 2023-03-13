package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static String[] getArray(int initNumber, int step, int size) {
        String[] progression = new String[size];
        for (var i = 0; i < size; i++) {
            progression[i] = Integer.toString(initNumber + i * step);
        }
        return progression;
    }

    public static void runGame() {
        String[][] questionsAndResults = new String[Engine.getRounds()][2];
        for (var i = 0; i < Engine.getRounds(); i++) {
            int init = Utils.getRandomNumber();
            int step = Utils.getRandomNumWithBounds();
            int progressionSize = Utils.getProgressionSize();
            Random rand = new Random();
            int hiddenElement = rand.nextInt(0, progressionSize - 1);
            String[] progression = getArray(init, step, progressionSize);
            String result = progression[hiddenElement];
            progression[hiddenElement] = "..";
            questionsAndResults[i][0] = "Question: " + String.join(" ", progression);
            questionsAndResults[i][1] = result;
        }
        Engine.flow(questionsAndResults, DESCRIPTION);
    }
}
