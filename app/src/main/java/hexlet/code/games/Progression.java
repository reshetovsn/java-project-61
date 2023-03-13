package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int U_BOUND = 100;
    private static final int L_BOUND = 1;
    private static final int L_BOUND_PROGRESSION = 5;
    private static final int U_BOUND_PROGRESSION = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static String[] returnProgression(int initNumber, int step, int size) {
        String[] progression = new String[size];
        for (var i = 0; i < size; i++) {
            progression[i] = Integer.toString(initNumber + i * step);
        }
        return progression;
    }

    public static void runGame() {
        String[][] questionsAndResults = new String[Engine.ROUNDS][2];
        for (var i = 0; i < Engine.ROUNDS; i++) {
            int init = Utils.getRandomNumber(U_BOUND);
            int step = Utils.getRandomNumWithBounds(L_BOUND, U_BOUND);
            int progressionSize = Utils.getRandomNumWithBounds(L_BOUND_PROGRESSION, U_BOUND_PROGRESSION);
            int hiddenElement = Utils.getRandomNumWithBounds(0, progressionSize - 1);
            String[] progression = returnProgression(init, step, progressionSize);
            String result = progression[hiddenElement];
            progression[hiddenElement] = "..";
            questionsAndResults[i][0] = String.join(" ", progression);
            questionsAndResults[i][1] = result;
        }
        Engine.flow(questionsAndResults, DESCRIPTION);
    }
}
