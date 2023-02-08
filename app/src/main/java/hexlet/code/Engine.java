package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner sc;
    private static String userName;
    private static final int ROUNDS = 3; // fix number of rounds in all games
    private static final int UPPER_BOUNDS_FOR_RAND = 100; // Upper Bound for generated random number
    // for getting numberOfRounds in games
    public static int getRounds() {
        return ROUNDS;
    }
    public static int getUpperBound() {
        return UPPER_BOUNDS_FOR_RAND;
    }
    // Greeting. Used in all games at the very beginning //
    public static void greeting() {
        sc = new Scanner(System.in);
        System.out.println("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
    // Congratulation. Used after a win //
    public static void congratulation() {
        System.out.println("Congratulations, " +  userName + "!");
    }
    // TryAgain. Used after a lose //
    public static void tryAgain() {
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }
    // Method checks answers and return true of false //
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
    // This method is flow of the games //
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
