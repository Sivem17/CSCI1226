package l04a;

import java.util.Scanner;

/**
 * A program to check whether the user is eligible for a (fictional) pension.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class PensionEligibility {

    public static void main(String[] args) {
        // create required constants
        final int NORMAL_AGE = 65;  // normal age of eligibility
        final int EARLY_AGE = 50;   // age for early eligibility

        // create required variables
        Scanner kbd = new Scanner(System.in);
        int age;
        String resp;
        boolean disability, eligible;

        // introduce yourself
        System.out.print("This program checks to see "
                + "if you are eligible for a pension.\n"
                + "Please answer the questions truthfully.\n\n");

        // get user's age
        System.out.print("How old are you? ");
        age = kbd.nextInt();
        while (age < 0 || age > 120) {
            System.out.print("Your age must be between 0 and 120.\n"
                    + "How old are you? ");
            age = kbd.nextInt();
            kbd.nextLine();
        }

        // find out whether user has a disability
        System.out.print("Do you have a disability? ");
        resp = kbd.next().toUpperCase();
        while (!resp.startsWith("YES")
                && !resp.startsWith("NO")) {
            System.out.print("Please enter yes or no.\n"
                    + "Do you have a disability? ");
            resp = kbd.next().toUpperCase();
            kbd.nextLine();
        }
        // resp is now either YES or NO
        System.out.println();

        // determine eligibility
        disability = resp.startsWith("YES");
        eligible = (age >= NORMAL_AGE)
                || (age >= EARLY_AGE && disability);

        // priovide further instructions for user
        if (eligible) {
            System.out.print("You are eligible for this pension.\n"
                    + "Please contact us at http://nuhuh.gov.ca\n\n");
        } else {
            System.out.print("You are not eligible for this pension.\n"
                    + "Please go away.\n\n");
        }
    }

}
