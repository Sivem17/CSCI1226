package a08;

/**
 * A class of helper methods for working with arrays.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class ArrayOperations {

    /**
     * Sums up all the element inside the array using advanced for loop and
     * returns it.
     *
     * @param a an integer array.
     * @return sum of the elements of the array.
     */
    public static int getSum(int[] a) {
        int sum = 0;
        //USING FOREACH LOOP           SAME CAN BE DONE BY NORMAL FOR LOOP
        for (int i : a) {     //------>(int i = 0; i < a.length; i++) {
            sum += i;         //------>sum = sum + a[i];
        }
        return sum;
    }

    /**
     * Compares the two integer array and sets the size equal to the shorter
     * array.
     *
     * @param a an integer array.
     * @param b an integer array.
     * @return size which is shorter.
     */
    private static int getShorterSize(int[] a, int[] b) {
        int size;
        if (a.length < b.length) {
            size = a.length;
        } else {
            size = b.length;
        }
        return size;
    }

    /**
     * Creates another array of size equal to the shorter integer array( by
     * calling the getShorterSize() method ) and fills its elements by adding
     * the pairwise elements of the two integer arrays.
     *
     * @param a an integer array.
     * @param b an integer array.
     * @return the new created array.
     */
    public static int[] add(int[] a, int[] b) {
        int size = getShorterSize(a, b);
        int[] sumArray = new int[size];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = a[i] + b[i];
        }
        return sumArray;
    }

    /**
     *
     * Creates another array of size equal to the shorter integer array( by
     * calling the getShorterSize() method ) and fills its elements by adding
     * the pairwise elements of the two integer arrays.
     *
     * @param a an integer array.
     * @param b an integer array
     * @return the new created array.
     */
    public static int[] multiply(int[] a, int[] b) {
        int size = getShorterSize(a, b);
        int[] reqArray = new int[size];
        for (int i = 0; i < reqArray.length; i++) {
            reqArray[i] = a[i] * b[i];
        }
        return reqArray;
    }

    /**
     * Checks if all the elements in the array are 0 or not.
     *
     * @param a an integer array.
     * @return true if all the elements of the array are 0.
     */
    public static boolean allZeroes(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the elements of the shorter array are equal to the first
     * elements of the longer array.
     *
     * @param a an integer array.
     * @param b an integer array.
     * @return true if the shorter array has its elements equal to the front
     * part of the longer array.
     */
    public static boolean prefix(int[] a, int[] b) {
        if (a.length <= b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
        } else if (b.length <= a.length) {
            for (int i = 0; i < b.length; i++) {
                if (b[i] != a[i]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    /**
     * Calls the multiply() method to multiply two integer arrays and then calls
     * the getSum() method to get the sum of the elements of the new array
     * created by the multiply() method.
     *
     * @param a an integer array.
     * @param b an integer array.
     * @return dot product of the two integer arrays.
     */
    public static int dotProduct(int[] a, int[] b) {
        return getSum(multiply(a, b));
    }

}
