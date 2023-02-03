package hexlet.code;

import hexlet.code.games.GameEvenNumber;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
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
        }
    }
}
