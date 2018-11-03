package l05;

import java.util.Scanner;

/**
 * This program rolls some dice.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class DoDice {

    public static void main(String[] args) {
        // create variables
        Scanner kbd = new Scanner(System.in);
        int d1, d2, sum, numSides;

        // Introduce yourself
        Introduction();

        // pause
        pause(kbd);

        // roll dice
        System.out.println("First I'm rolling some 6-sided dice.");
        d1 = rollD6();
        d2 = rollD6();
        sum = d1 + d2;
        System.out.println("I got a " + d1 + " and a " + d2 + ".\n"
                + "The total is " + sum + ".");

        // pause
        pause(kbd);

        // Get a number of sides from the user
        System.out.println("There are more kinds of dice "
                + "than just ones with six sides. ");
        System.out.print("How many sides would you like the dice to have? ");
        numSides = kbd.nextInt();
        kbd.nextLine();
        d1 = rollD(numSides);
        d2 = rollD(numSides);
        sum = d1 + d2;
        System.out.println("I got a " + d1 + " and a " + d2 + ".\n"
                + "The total is " + sum + ".");

        // pause
        pause(kbd);

        // roll and report on d10 and d100
        System.out.println("Finally, I'm rolling a d10 and a d100.");
        d1 = rollD(numSides = 10);
        d2 = rollD(numSides = 100);
        System.out.println("I got a " + d1 + " on the d10"
                + " and a " + d2 + " on the d100.");

        // pause
        pause(kbd);
    }

    private static void pause(Scanner kbd) {
        System.out.println();
        System.out.print("Press Enter...");
        kbd.nextLine();
        System.out.println();
    }

    private static void Introduction() {
        System.out.println("\n"
                + "Dice Rolling Program\n"
                + "--------------------\n\n"
                + "This program rolls some dice!");
        System.out.println("\n"
                + "Original program by Mark Young (A00000000)\n"
                + "With revisions by Aitezaz Siddiqi (A00431079)");
    }

    private static int rollD6() {
        return (1 + (int) (6 * Math.random()));
    }

    private static int rollD(int numSides) {
        return (1 + (int) (numSides * Math.random()));
    }

}
