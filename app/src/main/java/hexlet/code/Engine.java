package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    private static Scanner sc;
    // Greeting. Used in all Games at the start //
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
        sc.close();
    }

}
