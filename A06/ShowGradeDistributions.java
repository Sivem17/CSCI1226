package a06;

import java.util.Scanner;

/**
 * A program to test the GradeDistribution data type.
 * DO NOT MODIFY THIS PROGRAM!
 *
 * @author Mark Young (A00000000)
 */
public class ShowGradeDistributions {
    
    public static final int NUM_SECTIONS = 2;

    public static void main(String[] args) {
        // create required variables
        Scanner kbd = new Scanner(System.in);
        int grade;
        GradeDistribution gd = new GradeDistribution();

        // print introduction
        printIntroduction();
        pause(kbd);

        // process each section of the course
        for (int section = 1; section <= NUM_SECTIONS; section++) {
            // erase any old values that might have been saved
            gd.reset();

            // ask for and read the grades
            System.out.println("\n"
                + "Enter the grades for section #" + section + ".\n"
                + "Enter a -1 to end the grades:");
            grade = kbd.nextInt();
            while (grade >= 0) {
                // add this grade to the distribution...
                gd.addGrade(grade);

                // .. and get another
                grade = kbd.nextInt();
            }
            kbd.nextLine();
            pause(kbd);

            // print report
            System.out.println("As:\t" + gd.getAs() 
                                + "\t(" + gd.percentAs() + "%)");
            System.out.println("Bs:\t" + gd.getBs() 
                                + "\t(" + gd.percentBs() + "%)");
            System.out.println("Cs:\t" + gd.getCs() 
                                + "\t(" + gd.percentCs() + "%)");
            System.out.println("Ds:\t" + gd.getDs() 
                                + "\t(" + gd.percentDs() + "%)");
            System.out.println("Fs:\t" + gd.getFs() 
                                + "\t(" + gd.percentFs() + "%)");
            System.out.println("Total:\t" + gd.getTotal()); 
            gd.print();
            pause(kbd);
        }
    }

    // print the program's introduction
    private static void printIntroduction() {
        System.out.print("\n\n"
            + "Show Grade Distributions\n"
            + "------------------------\n\n"
            + "by Mark Young (A00000000)\n\n"
            + "This program shows the grade distribution "
            + "for several sections.\n\n");
    }

    // prompt and wait for the user to press enter
    // NOTE: kbd must be empty when this method is called
    private static void pause(Scanner kbd) {
        System.out.print("\nPress Enter...");
        kbd.nextLine();
        System.out.println();
    }

}
