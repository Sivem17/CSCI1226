/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a08;

/**
 *
 * @author s3607751
 */
public class ArrayOperations {

    public static int getSum(int[] a) {
        int sum = 0;
        //USING FOREACH LOOP           SAME CAN BE DONE BY NORMAL FOR LOOP
        for (int i : a) {     //------>(int i = 0; i < a.length; i++) {
            sum += i;         //------>sum = sum + a[i];
        }
        return sum;
    }

    public static int[] add(int[] a, int[] b) {
        int[] sumArray = new int[0];

        for (int i = 0; i < a.length && i < b.length; i++) {
            sumArray[i] = a[i] + b[i];
        }

        return sumArray;
    }

}
