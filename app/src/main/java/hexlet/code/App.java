package hexlet.code;

import hexlet.code.games.GameCalculator;
import hexlet.code.games.GameEvenNumber;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GameProgression;

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
                + "0 - Exit\n"
                + "Your choice: ");
        int choiceNumber = sc.nextInt();
        System.out.println(choiceNumber);
        if (choiceNumber == 0) {
            sc.close();
        } else if (choiceNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.greeting();
        } else if (choiceNumber == 2) {
            System.out.println("Welcome to the Brain Games!");
            GameEvenNumber.checkEven();
        } else if (choiceNumber == 3) {
            System.out.println("Welcome to the Brain Games!");
            GameCalculator.checkResults();
        } else if (choiceNumber == 4) {
            System.out.println("Welcome to the Brain Games!");
            GameGCD.getNod();
        } else if (choiceNumber == 5) {
            System.out.println("Welcome to the Brain Games!");
            GameProgression.getNumFromProgression();
        }
    }
}
