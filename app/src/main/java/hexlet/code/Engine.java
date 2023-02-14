package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner sc;
    private static String userName;
    private static final int ROUNDS = 3;
    private static final int UPPER_BOUNDS_FOR_RAND = 100;

    public static int getRounds() {
        return ROUNDS;
    }
    public static int getUpperBound() {
        return UPPER_BOUNDS_FOR_RAND;
    }

    public static void greeting() {
        sc = new Scanner(System.in);
        System.out.println("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static void congratulation() {
        System.out.println("Congratulations, " +  userName + "!");
    }

    public static void tryAgain() {
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }

    public static boolean checkAnswers(String answer, String result) {
        if (answer.equals(result)) {
        System.out.println("Correct!");
        return true;
        } else {
        System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + ".");
        tryAgain();
        return false;
        }
    }

    public static void flow(String[] questions, String[] result, String task) {
        greeting();
        System.out.println(task);
        var answer = new String[getRounds()];
        for (var i = 0; i < getRounds(); i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            answer[i] = sc.next();
            checkAnswers(answer[i], result[i]);
        }
        congratulation();
    }
}
