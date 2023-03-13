package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;

    public static void flow(String[][] questionsAndAnswers, String task) {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(task);
        for (var i = 0; i < ROUNDS; i++) {
            String result = questionsAndAnswers[i][1];
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String answer = sc.next();
            if (answer.equals(result)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + ".");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
