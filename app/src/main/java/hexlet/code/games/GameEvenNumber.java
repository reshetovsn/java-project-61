package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameEvenNumber {
    public static void checkEven() {
        Scanner scanner = new Scanner(System.in);
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var count = 0;
        while (count < 3) {
            var randNum = (int)(Math.random() * 100);
            System.out.println("Question: " + randNum);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equals("yes") && randNum % 2 == 0) {
                System.out.println("Correct!");
                count = count + 1;
            } else if (answer.equals("yes") && randNum % 2 != 0) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                Engine.tryAgain();
                break;
            } else if (answer.equals("no") && randNum % 2 != 0) {
                System.out.println("Correct!");
                count = count + 1;
            } else if (answer.equals("no") && randNum % 2 == 0) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'");
                Engine.tryAgain();
                break;
            } else {
                System.out.println(answer + " is wrong answer ;(. Please type only 'yes' or 'no'.");
                Engine.tryAgain();
                break;
            }
            if (count > 2) {
                Engine.congratulation();
            }
        }
        scanner.close();
    }
}
