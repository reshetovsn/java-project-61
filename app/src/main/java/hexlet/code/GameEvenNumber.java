package hexlet.code;

import java.util.Scanner;

public class GameEvenNumber {
    public static void checkEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var count = 0;
        while (count < 3) {
            var randNum = (int)(Math.random() * 100);
            System.out.println("Question: " + randNum);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            System.out.print(answer);
            if (answer.equals("yes") && randNum % 2 == 0) {
                System.out.println("Correct!");
                count = count + 1;
            } else if (answer.equals("yes") && randNum % 2 != 0) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + userName + "!");
                break;
            } else if (answer.equals("no") && randNum % 2 != 0) {
                System.out.println("Correct!");
                count = count + 1;
            } else if (answer.equals("no") && randNum % 2 == 0) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again, " + userName + "!");
                break;
            } else {
                System.out.println(answer + " is wrong answer ;(. Please type only 'yes' or 'no'.\n"
                        + "Let's try again, " + userName + "!");
                break;
            }
            if (count > 2) {
                System.out.println("Congratulations, " +  userName + "!");
            }
        }
        scanner.close();
    }
}
