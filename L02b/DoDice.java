/**
 * A program rolls some dice.
 *
 * @author Mark Young (A00000000)
 * @author Aitezaz Siddiqi (A00431079)
 */
package l02b;

import java.util.Scanner;
import java.util.Random;


public class DoDice {

    public static void main(String[] args) {
        // create variables
        Scanner kbd = new Scanner(System.in);
        Random r = new Random();
        int d1, d2, d4, d20, sum1, numSides;

        // Introduce yourself
        System.out.println("\n"
                + "Dice Rolling Program\n"
                + "--------------------\n\n"
                + "This program rolls some dice!");

        // pause
        System.out.println();
        System.out.print("Press Enter...");
        kbd.nextLine();
        System.out.println();

        // roll dice
        System.out.println("First I'm rolling some 6-sided dice (d6).\n");
        d1 = r.nextInt(6) + 1;
        d2 = r.nextInt(6) + 1;
        sum1 = d1 + d2;
        System.out.println("I got a " + d1 + " and a " + d2 + ".\n"
                + "The total is " + sum1 + ".");

        // pause
        System.out.println();
        System.out.print("Press Enter...");
        kbd.nextLine();
        System.out.println();

        // roll and report on d4 and d20
        System.out.println("There are more kinds of dice "
                + "than just ones with six sides. ");
        System.out.println("For example, "
                + "there are 4-sided dice (d4) and 20-sided dice (d20).\n");
        d4 = r.nextInt(4) + 1;
        d20 = r.nextInt(20) + 1;
        sum1 = d4 + d20;
        System.out.println("I got a " + d4 + " on the d4 and a " + d20
                + " on the d20.\n"
                + "The total is " + sum1 + ".");

        // pause
        System.out.println();
        System.out.print("Press Enter...");
        kbd.nextLine();
        System.out.println();

        // get number of sides for an imaginary die
        System.out.println("In fact, with a computer, "
                + "we can pretend we have any number \n"
                + "of sides at all on a dice "
                + "(even if it's physically impossible).\n");
        System.out.print("How many sides would you like the dice to have? ");
        numSides = kbd.nextInt();
        kbd.nextLine();
        System.out.println();

        // roll and sum two of those dice
        d1 = r.nextInt(numSides) + 1;
        d2 = r.nextInt(numSides) + 1;
        sum1 = d1 + d2;
        System.out.println("I rolled two d" + numSides + " and I got a " + d1
                + " and a " + d2 + ".\n"
                + "The total is " + sum1 + ".");

        // pause
        System.out.println();
        System.out.print("Press Enter...");
        kbd.nextLine();
        System.out.println();
    }
}
