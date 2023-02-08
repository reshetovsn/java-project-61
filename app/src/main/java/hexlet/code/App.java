package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        int choiceNumber = sc.nextInt();
        System.out.println(choiceNumber);
        if (choiceNumber == 0) {
            sc.close();
        } else if (choiceNumber == 1) {
            Cli.greeting();
        } else if (choiceNumber == 2) {
            GameEvenNumbers.checkEven();
        } else if (choiceNumber == 3) {
            GameCalculator.checkResults();
        } else if (choiceNumber == 4) {
            GameGCD.getNod();
        } else if (choiceNumber == 5) {
            GameProgression.getNumFromProgression();
        } else if (choiceNumber == 6) {
            GamePrimeNumber.checkPrime();
        }
    }
}
