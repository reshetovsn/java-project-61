package hexlet.code;

import hexlet.code.games.GameEvenNumbers;
import hexlet.code.games.GameCalculator;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrimeNumber;
import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int GREETING = 1;
    private static final int GAME_EVEN_NUMBERS = 2;
    private static final int GAME_CALCULATOR = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME_NUMBER = 6;

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int choiceNumber = sc.nextInt();
        switch (choiceNumber) {
            case EXIT:
                System.out.println("Goodbye!");
                sc.close();
                break;
            case GREETING:
                Cli.greeting();
                break;
            case GAME_EVEN_NUMBERS:
                GameEvenNumbers.checkEven();
                break;
            case GAME_CALCULATOR:
                GameCalculator.checkResults();
                break;
            case GAME_GCD:
                GameGCD.getNod();
                break;
            case GAME_PROGRESSION:
                GameProgression.getNumFromProgression();
                break;
            case GAME_PRIME_NUMBER:
                GamePrimeNumber.checkPrime();
                break;
            default:
                System.out.println("Your choice is incorrect. Please choose from 0-6");
                break;
        }
    }
}
