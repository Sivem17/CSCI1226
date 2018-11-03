package l04c;

import java.util.Scanner;

/**
 * A program to draw a shape.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class DrawShape {

    public static void main(String[] args) {
        // create required variables
        Scanner kbd = new Scanner(System.in);
        int height;

        // get user's number
        System.out.println();
        System.out.println("This program prints a triangle.");
        System.out.println();
        System.out.print("Enter the height of the triangle: ");
        height = kbd.nextInt();
        kbd.nextLine();
        System.out.println();

        // print the shape
        for (int line = 1; line <= height; ++line) {
            // print one line of the star
            for (int star = 1; star <= line; ++star) {
                System.out.print("*");
            }
            // end the line of stars
            System.out.println();
        }
        // print the shape
        for (int j = height - 1; j >= 1; --j) {
            //print one line of star
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            // print a blank line afterwards
            System.out.println();
        }
        System.out.println();
    }
}
