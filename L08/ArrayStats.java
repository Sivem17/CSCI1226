package l08;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class ArrayStats {

    private static int[] reqArray;

    static int[] createRandomArray(int size, int max) {
        reqArray = new int[size];
        for (int i = 1; i <= size; ++i) {
            reqArray[i] = 1 + ((int) (Math.random() * max));
        }
        return reqArray;
    }

    static String getMin(int[] i) {
        return "";
    }

    static String getMax(int[] i) {
        return "";
    }

    static String getSum(int[] i) {
        return "";
    }

    static String getMean(int[] i) {
        return "";
    }

    static String getMedian(int[] i) {
        return "";
    }

}
