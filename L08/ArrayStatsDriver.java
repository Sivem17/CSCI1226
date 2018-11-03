package l08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A program to test the ArrayStats class methods.
 *
 * @author yasushi akiyama
 * @author Mark Young
 */
public class ArrayStatsDriver {

    // standard input stream
    private static final Scanner KBD = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //First creating empty arrays
        int[] a, b, c, d, e;

        // create arrays of random numbers
        System.out.println("---- Filling some arrays with random numbers---");
        a = ArrayStats.createRandomArray(5, 10);
        b = ArrayStats.createRandomArray(10, 100);
        c = ArrayStats.createRandomArray(15, 1000);
        d = ArrayStats.createRandomArray(20, 10);
        e = ArrayStats.createRandomArray(20, 6);

        // display the arrays
        System.out.println("Original arrays:");
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));
        System.out.println("d = " + Arrays.toString(d));
        System.out.println("e = " + Arrays.toString(e));
        pause();

        // checking getMin() and getMax()
        System.out.println("---- Checking getMin() and getMax() ---");
        System.out.println("Min and Max of the array b are "
                + ArrayStats.getMin(b) + " and " + ArrayStats.getMax(b));
        System.out.println("Min and Max of the array c are "
                + ArrayStats.getMin(c) + " and " + ArrayStats.getMax(c));
        pause();

        // checking getSum()
        System.out.println("---- Checking getSum() ---");
        System.out.println("Sum of the elements of array a is "
                + ArrayStats.getSum(a));
        System.out.println("Sum of the elements of array e is "
                + ArrayStats.getSum(e));
        pause();

        // checking getMean()
        System.out.println("---- Checking getMean() ---");
        System.out.println("Mean of the array b is "
                + ArrayStats.getMean(b));
        System.out.println("Mean of the array d is "
                + ArrayStats.getMean(d));
        pause();

        // checking getMedian()
        System.out.println("---- Checking getMedian() ---");
        System.out.println("Median of the array a is "
                + ArrayStats.getMedian(a));
        System.out.println("Median of the array b is "
                + ArrayStats.getMedian(b));
        pause();

    }//end main()

    /**
     * Prompt user and wait for them to press enter.
     */
    private static void pause() {
        System.out.print("\n...press enter...");
        KBD.nextLine();
        System.out.println("\n");
    }

}
