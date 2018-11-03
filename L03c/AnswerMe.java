package l03c;

import java.util.Scanner;

/**
 * A program to respond to a user's comment/question.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class AnswerMe {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String input;

        // Get user's input
        System.out.print("Hi. Enter a question or comment below: ");
        input = kbd.nextLine();
        System.out.println();

        // responds to user's comment
        if (input.endsWith("!")) {
            System.out.println("That's very exciting.");

        } else if (input.endsWith(".")) {
            System.out.println("OK");

        } else if (input.endsWith("?")) {
            if (input.startsWith("Are you")) {
                System.out.println("I might be.");
            } else if (input.startsWith("Do you")) {
                System.out.println("Probably not.");
            } else {
                System.out.println("Who knows?");
            }

        } else {
            System.out.println("Sorry, I'll have to get "
                    + "back to you on that.");
        }

        // say goodbye
        System.out.println();

        System.out.println(
                "Bye now!");
        System.out.println();
    }

}
