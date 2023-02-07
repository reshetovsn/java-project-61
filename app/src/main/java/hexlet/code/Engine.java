package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner sc;
    private static String userName;
    private static int rounds = 3;

    // to take numberOfRounds in games
    public static int getRounds(){
        return rounds;
    }
    // Greeting. Used in all games at the start //
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
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
        var answer = new String[rounds];
        for (var i = 0; i < rounds; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            answer[i] = sc.next();
            checkAnswers(answer[i], result[i]);
        }
        congratulation();
    }
}
