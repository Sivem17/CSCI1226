/**
 * A program for checkerboard Nameplate.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
package a01;

import java.util.Scanner;

public class MyPlate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        int number_letters;
        
        System.out.print("Enter your full name: ");
        String customer_name;
        customer_name = kbd.nextLine();
        
        System.out.print("Enter your course name and number: ");
        String course_name;
        course_name = kbd.nextLine();
        
        System.out.print("Enter your course term: ");
        String course_term;
        course_term = kbd.nextLine();
        
        
        String asterisk_pattern;
        asterisk_pattern = "\n"
                + "********\n"
                + " ********\n"
                + "********\n"
                + " ********\n"
                + "********\n"
                + " ********\n"
                + "********\n"
                + " ********\n"
                + "\n";
        
        System.out.print(asterisk_pattern + customer_name + "\n"
                        + course_name + "\n"
                        + course_term + "\n");

        

        /*number_letters = customer_name.length();
            if (number_letters <= 20) {
                 System.out.println("********");
                }   else {
                 System.out.println("Number of letters: " + number_letters);
                }*/
        
    
    }
}
