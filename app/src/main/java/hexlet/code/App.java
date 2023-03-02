package hexlet.code;

import hexlet.code.games.EvenNumbers;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.PrimeNumber;
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
            case EXIT -> {
                System.out.println("Goodbye!");
                sc.close();
            }
            case GREETING -> Cli.greeting();
            case GAME_EVEN_NUMBERS -> EvenNumbers.runGame();
            case GAME_CALCULATOR -> Calculator.runGame();
            case GAME_GCD -> GCD.runGame();
            case GAME_PROGRESSION -> Progression.runGame();
            case GAME_PRIME_NUMBER -> PrimeNumber.runGame();
            default -> System.out.println("Your choice is incorrect. Please choose from 0-6");
        }
    }
}
