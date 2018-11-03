package l01;

import java.util.Scanner;

/**
 * A program to calculate the user's BMI using imperial/US measures.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class BMICalculator {

    public static void main(String[] args) {
        // create variables
        Scanner kbd = new Scanner(System.in);
        int Feet, inches, poundWeight, inch_height;
        double bmi, metreHeight, kgWeight;

        // introduce yourself
        System.out.println("This program calculates your body mass index.");
        System.out.println();

        // get user input
        System.out.print("Enter your height in feet and inches: ");
        Feet = kbd.nextInt();
        inches = kbd.nextInt();
        kbd.nextLine();
        System.out.print("Enter your weight in pounds: ");
        poundWeight = kbd.nextInt();

        // pause
        System.out.println();
        kbd.nextLine();
        System.out.println();

        // do calculations
        inch_height = 12 * Feet + inches;
        metreHeight = inch_height * 0.0254;
        kgWeight = poundWeight / 2.2;
        bmi = kgWeight / metreHeight;

        // report results
        System.out.println("You said you were : " + Feet + "'" + inches + "\" tall.");
        System.out.println("You said you weighed : " + poundWeight + " pounds.");
        System.out.println("Your height in metres is : " + metreHeight + ".");
        System.out.println("Your weight in kilograms is : " + kgWeight + ".");
        System.out.println("Your body mass index (BMI) is : " + bmi + ".");
    }

}
