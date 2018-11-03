package a05;

import java.util.Scanner;

/**
 * program to calculate the overall assignment grades in a class
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class AssignmentGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        //DECLARING INT
        int assignmentScores, lowestScores;
        //DECLARING DOUBLE
        double finalResult, total = 0, avgStudent, avgClass = 0;

        //CALL TO METHODS
        printIntroduction();
        printPause(kbd);

        System.out.print("Enter a student number or leave blank to quit: ");
        //DECLARING STRING
        String aNumber;
        aNumber = kbd.nextLine();

        //LOOP FOR REPEATING IF THERE IS ANY ANUMBER
        while (!(aNumber.isEmpty())) {
            finalResult = 0;
            lowestScores = 101;
            total += 1;
            System.out.print("Enter " + aNumber + "'s " + NUM_OF_ASSIGNMENT
                    + " assignment scores: ");
            //LOOP FOR READING IN ASSIGNMENT NUMBERS 6 TIMES
            for (int i = 1; i <= NUM_OF_ASSIGNMENT; ++i) {
                assignmentScores = kbd.nextInt();
                finalResult += assignmentScores;
                //LOOP FOR SETTING THE LOWEST SCORE
                if (assignmentScores < lowestScores) {
                    lowestScores = assignmentScores;
                }
            }

            kbd.nextLine();
            avgStudent = (finalResult - lowestScores) / (NUM_OF_ASSIGNMENT - 1);

            System.out.println();
            System.out.println("Student " + aNumber + ": " + avgStudent + "%");
            avgClass += avgStudent;

            //CALL TO A METHOD
            printPause(kbd);
            System.out.print("Enter a student number or leave blank to quit: ");
            aNumber = kbd.nextLine();

        }
        System.out.println();
        System.out.println("Class Average: " + avgClass / total + "%");

    }

    //A PRIVATE STATIC CONSTANT
    private static final int NUM_OF_ASSIGNMENT = 6;

    //METHOD FOR INTRODUCTION
    private static void printIntroduction() {
        System.out.println("Assignment Grade Calculator");
        System.out.println("---------------------------");
        System.out.println();

        System.out.println("This program calculates the overall assignment"
                + " grade \nfor a list of students in a class");
        System.out.println();
        System.out.println("By - Aitezaz Siddiqi (A00431079)");
        System.out.println("--------------------------------");
    }

    //METHOD FOR PAUSE
    private static void printPause(Scanner kbd) {
        System.out.println();
        System.out.print("Press Enter key to continue...");
        kbd.nextLine();
        System.out.println();

    }

}
