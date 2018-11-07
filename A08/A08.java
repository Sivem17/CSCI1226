package a08;

import java.util.Arrays;

/**
 * A program to test the ArrayOperations class.
 *
 * @author Mark Young (A00000000)
 */
public class A08 {
    
    public static void main(String[] args) {
        // create required arrays
        int[] arr1234 = new int[]{1, 2, 3, 4};
        int[] arrN1N2N54 = new int[]{-1, -2, -5, 4};
        int[] arr123 = new int[]{1, 2, 3};
        int[] arr0004 = new int[]{0, 0, 0, 4};
        int[] arr0000 = new int[]{0, 0, 0, 0};
        int[] arr0 = new int[]{0};
        int[] arr = new int[]{};
        int[] arr12 = new int[]{1, 2};
        int[] arr1524 = new int[]{1, 5, 2, 4};
        int[] arr2468 = new int[]{2, 4, 6, 8};
        int[] arr00N28 = new int[]{0, 0, -2, 8};
        int[] arr246 = new int[]{2, 4, 6};
        int[] arr00N2 = new int[]{0, 0, -2};
        int[] arrN1N4N1516 = new int[]{-1, -4, -15, 16};
        int[] arr14916 = new int[]{1, 4, 9, 16};
        int[] arr149 = new int[]{1, 4, 9};
        int[] arrN1N4N15 = new int[]{-1, -4, -15};

        // introduce yourself
        printIntroduction();
        
        // test getSum
        System.out.println("Testing getSum");
        testSum(arr1234, 10);
        testSum(arrN1N2N54, -4);
        testSum(arr, 0);

        // test add
        System.out.println("Testing add");
        testAdd(arr1234, arr1234, arr2468);
        testAdd(arr1234, arrN1N2N54, arr00N28);
        testAdd(arr1234, arr123, arr246);
        testAdd(arr123, arrN1N2N54, arr00N2);

/* DELETE THIS LINE to test multiply
        // test multiply
        System.out.println("Testing multiply");
        testMultiply(arr1234, arr1234, arr14916);
        testMultiply(arr1234, arrN1N2N54, arrN1N4N1516);
        testMultiply(arr1234, arr123, arr149);
        testMultiply(arr123, arrN1N2N54, arrN1N4N15);

/* DELETE THIS LINE to test allZeroes
        // test allZeroes
        System.out.println("Testing allZeroes");
        testZeroes(arr1234, false);
        testZeroes(arr0004, false);
        testZeroes(arr0000, true);
        testZeroes(arr0, true);
        testZeroes(arr, true);

/* DELETE THIS LINE to test prefix
        // test prefix
        System.out.println("Testing prefix");
        testPrefix(arr12, arr1234, true);
        testPrefix(arr1234, arr1234, true);
        testPrefix(arr1234, arr123, false);
        testPrefix(arr12, arr1524, false);

/* DELETE THIS LINE to test dotProduct -- delete one more line below
        // test dotProduct
        System.out.println("Testing dotProduct");
        testDot(arr1234, arr1234, 30);
        testDot(arr1234, arrN1N2N54, -4);
        testDot(arr1234, arr123, 14);
        testDot(arr123, arrN1N2N54, -20);

        // done
        System.out.println("Testing complete....");
        System.out.println();
DELETE THIS LINE to test dotProduct */
    }

    // print an introductory message
    private static void printIntroduction() {
        System.out.print("\n"
                + "ArrayOperations Tester\n"
                + "----------------------\n\n"
                + "This program runs tests of the methods in "
                + "ArrayOperations.\n\n"
                + "Activate sections as needed.\n\n");
    }

    // ---------- Testing Methods ---------- //

    private static void testSum(int[] arr, int expected) {
        int got = ArrayOperations.getSum(arr);
        if (got != expected) {
            error("getSum of " + Arrays.toString(arr), got, expected);
        }
    }

    private static void testAdd(int[] arr1, int[] arr2, int[] expected) {
        int[] got = ArrayOperations.add(arr1, arr2);
        if (!Arrays.equals(got, expected)) {
            error("adding " + Arrays.toString(arr1) + " and " 
                    + Arrays.toString(arr2), got, expected);
        }
    }

//    private static void testMultiply(int[] arr1, int[] arr2, int[] expected) {
//        int[] got = ArrayOperations.multiply(arr1, arr2);
//        if (!Arrays.equals(got, expected)) {
//            error("multiplying " + Arrays.toString(arr1) + " and " 
//                    + Arrays.toString(arr2), got, expected);
//        }
//    }
//
//    private static void testZeroes(int[] arr, boolean expected) {
//        boolean got = ArrayOperations.allZeroes(arr);
//        if (got != expected) {
//            error("allZeroes of " + Arrays.toString(arr), got, expected);
//        }
//    }
//
//    private static void testPrefix(int[] arr1, int[] arr2, boolean expected) {
//        boolean got = ArrayOperations.prefix(arr1, arr2);
//        if (got != expected) {
//            error("prefix " + Arrays.toString(arr1) + " and " 
//                    + Arrays.toString(arr2), got, expected);
//        }
//    }
//
//    private static void testDot(int[] arr1, int[] arr2, int expected) {
//        int got = ArrayOperations.dotProduct(arr1, arr2);
//        if (got != expected) {
//            error("dot product of " + Arrays.toString(arr1) + " and " 
//                    + Arrays.toString(arr2), got, expected);
//        }
//    }

    // ---------- Error Methods ------------ //

    private static void error(String label, int got, int expected) {
        System.out.println("> " + label + " returned " + got 
                + "(expected " + expected + ")");
    }

    private static void error(String label, int[] got, int[] expected) {
        System.out.println("> " + label + " returned " + Arrays.toString(got) 
                + "(expected " + Arrays.toString(expected) + ")");
    }

    private static void error(String label, boolean got, boolean expected) {
        System.out.println("> " + label + " returned " + got 
                + "(expected " + expected + ")");
    }

}
