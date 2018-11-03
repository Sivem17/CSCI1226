package l03a;

import java.util.Scanner;
import java.util.Random;

/**
 * Play a very simple random number guessing game
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class RandomGuess {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Random rnd = new Random();
        int guess;

        // introduce yourself
        System.out.println("**************************************");
        System.out.println("This program generates a random number\n"
                + "and you will guess what it is!");
        System.out.println("**************************************\n");

        // generate a random number chosen from 1-5
        int n = 1 + rnd.nextInt(5);

        // ask user to enter a guess (1-5)
        System.out.print("Enter your guess (1 to 5): ");
        guess = kbd.nextInt();
        kbd.nextLine();

        // prints appropriate response
        if (n == guess) {
            System.out.println("Congratulations! You guessed the "
                    + "correct number.");
        } else {
            System.out.println("Sorry! You guessed the"
                    + " wrong number.");
        }

        // print out the generated number
        System.out.println("The random number was " + n + ".");
    }

}
