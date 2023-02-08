package hexlet.code;

import hexlet.code.games.GameEvenNumbers;
import hexlet.code.games.GameCalculator;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrimeNumber;

import java.util.Scanner;

public class App {
    private static final int exit = 0;
    private static final int greeting = 1;
    private static final int gameEvenNumbers = 2;
    private static final int gameCalculator = 3;
    private static final int gameGCD = 4;
    private static final int gameProgression = 5;
    private static final int gamePrimeNumber = 6;
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n"
                + "5 - Progression\n"  + "6 - Prime\n" + "0 - Exit\n"  + "Your choice: ");
        int choiceNumber = sc.nextInt();
        System.out.println(choiceNumber);
        if (choiceNumber == exit) {
            sc.close();
        } else if (choiceNumber == greeting) {
            Cli.greeting();
        } else if (choiceNumber == gameEvenNumbers) {
            GameEvenNumbers.checkEven();
        } else if (choiceNumber == gameCalculator) {
            GameCalculator.checkResults();
        } else if (choiceNumber == gameGCD) {
            GameGCD.getNod();
        } else if (choiceNumber == gameProgression) {
            GameProgression.getNumFromProgression();
        } else if (choiceNumber == gamePrimeNumber) {
            GamePrimeNumber.checkPrime();
        }
    }
}
