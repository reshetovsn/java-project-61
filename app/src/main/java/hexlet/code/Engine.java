package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner sc;
    private static String userName;
    private static final int ROUNDS = 3;

    public static int getRounds() {
        return ROUNDS;
    }

    public static void greeting() {
        sc = new Scanner(System.in);
        System.out.println("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static boolean checkAnswers(String answer, String result) {
        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + ".");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
            return false;
        }
    }

    public static void flow(String[][] questionsAndAnswers, String[] result, String task) {
        greeting();
        System.out.println(task);
        for (var i = 0; i < getRounds(); i++) {
            System.out.println(questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            questionsAndAnswers[i][1] = sc.next();
            checkAnswers(questionsAndAnswers[i][1], result[i]);
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
