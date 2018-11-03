package l03b;

import java.util.Scanner;

/**
 * Evaluate a Music Student's Performance. The student passes if they get:
 * <ol type='a'>
 * <li> at least 60% on all the 3 aspects;
 * <li> at least 50% on expressiveness, and at least 70% on other two;
 * <li> at least 50% on other two, and at least 90% on note accuracy; OR
 * <li> at least 35% on expressiveness, but at least 90% on other two.
 * </ul>
 * Any other result, the student is required to re-test.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class JuryEvaluation {

    public static void main(String[] args) {
        // create required variables
        Scanner kbd = new Scanner(System.in);
        int expressiveness, timbreRichness, noteAccuracy;

        // introduce yourself
        System.out.print("\n"
                + "Jury Evaluation Program\n"
                + "-----------------------\n");

        // get evaluations
        System.out.print("Expressiveness score(%): ");
        expressiveness = kbd.nextInt();
        kbd.nextLine();
        System.out.print("Timbre richness score(%): ");
        timbreRichness = kbd.nextInt();
        kbd.nextLine();
        System.out.print("Note accuracy score(%): ");
        noteAccuracy = kbd.nextInt();
        kbd.nextLine();
        System.out.println();

        // reports PASS or RETEST according to the documented criteria
        if ((expressiveness >= 60 && timbreRichness >= 60 && noteAccuracy >= 60)
                || (expressiveness >= 50 && timbreRichness >= 70
                && noteAccuracy >= 70)
                || (expressiveness >= 50 && timbreRichness >= 50
                && noteAccuracy >= 90)
                || (expressiveness >= 35 && timbreRichness >= 90
                && noteAccuracy >= 90)) {
            System.out.println("You Pass.");
            
        } else {
            System.out.println("Recommend for re-test.");

        }
    }
}
