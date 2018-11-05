package l08;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class ArrayStats {

    static int[] reqArray;

    static int[] createRandomArray(int size, int max) {
        reqArray = new int[size];

        for (int i = 0; i <= size - 1; ++i) {
            reqArray[i] = 1 + (int) (Math.random() * max);
        }
        return reqArray;
    }

    static int getMin(int[] i) {
        int min = i[0];
        for (int j = 0; j <= i.length - 1; ++j) {
            if (i[j] <= min) {
                min = i[j];
            }
        }
        return min;
    }

    static int getMax(int[] i) {
        int max = i[0];
        for (int j = 0; j <= i.length - 1; ++j) {
            if (i[j] >= max) {
                max = i[j];
            }
        }
        return max;
    }

    static int getSum(int[] i) {
        int sum = 0;
        for (int j : i) {
            sum += j;
        }
        return sum;
    }

    static double getMean(int[] i) {
        int sum = 0;
        double mean;

        for (int j = 0; j <= i.length - 1; j++) {
            sum = sum + i[j];
        }
        mean = (double) sum / i.length;
        return mean;
    }

    static double getMedian(int[] i) {
        return (double) (i[i.length/2] + i[(i.length-1)/2]) / 2;
    }
}
