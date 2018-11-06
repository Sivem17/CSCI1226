package l08;

import java.util.Arrays;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class ArrayStats {

    /**
     * Creates an array of required size and fills it with random numbers as max
     * as its highest value.
     *
     * @param size number of element in the array.
     * @param max highest limit to randomize numbers upto.
     * @return the array
     */
    public static int[] createRandomArray(int size, int max) {
        int[] reqArray = new int[size];

        for (int i = 0; i <= size - 1; ++i) {
            reqArray[i] = 1 + (int) (Math.random() * max);
        }
        return reqArray;
    }

    /**
     * Calculates the minimum value of the array using advanced for loop and
     * returns it.
     *
     * @param i an integer array.
     * @return minimum value of an array.
     */
    public static int getMin(int[] i) {
        int min = i[0];

        //USING FOREACH LOOP          SAME CAN BE DONE BY NORMAL FOR LOOP
        for (int j : i) {     //----->(int j = 0; j <= i.length - 1; ++j) {
            if (j <= min) {   //----->(i[j] <= min) {
                min = j;      //----->min = i[j];
            }
        }
        return min;
    }

    /**
     * Calculates the maximum value of the array using advanced for loop and
     * returns it.
     *
     * @param i an integer array.
     * @return maximum value of an array.
     */
    public static int getMax(int[] i) {
        int max = i[0];

        //USING FOREACH LOOP         SAME CAN BE DONE BY NORMAL FOR LOOP
        for (int j : i) {    //----->(int j = 0; j <= i.length - 1; ++j) {
            if (j >= max) {  //----->(i[j] >= max) {
                max = j;     //----->max = i[j];
            }
        }
        return max;
    }

    /**
     * Sums up all the element inside the array using advanced for loop and
     * returns it.
     *
     * @param i an integer array.
     * @return sum of the elements of the array.
     */
    public static int getSum(int[] i) {
        int sum = 0;
        //USING FOREACH LOOP         SAME CAN BE DONE BY NORMAL FOR LOOP
        for (int j : i) {    //----->(int j = 0; j <= i.length - 1; j++) {
            sum += j;        //----->sum += i[j];
        }
        return sum;
    }

    /**
     * Calculates the mean value of the array using advanced for loop and
     * returns it.
     *
     * @param i an integer array.
     * @return mean value of the array.
     */
    public static double getMean(int[] i) {
        double sum = 0, mean;

        //USING FOREACH LOOP         SAME CAN BE DONE BY NORMAL FOR LOOP
        for (int j : i) {    //----->(int j = 0; j <= i.length - 1; j++) {
            sum += j;        //----->sum +=i[j];
        }
        mean = sum / i.length;
        return mean;
    }

    /**
     * Sorts the array list of the copied array and returns the median.
     *
     * @param i an integer array.
     * @return median of the array.
     */
    public static double getMedian(int[] i) {

        int[] j = Arrays.copyOf(i, i.length);
        Arrays.sort(j);
        if (j.length % 2 == 0) {
            return (j[j.length / 2] + j[(j.length / 2) - 1]) / (double) 2;
        } else {
            return j[j.length / 2];
        }
    }
}
