package l04b;

import java.util.Scanner;

/**
 * A program to print and sum the numbers from 1 to a number entered by the
 * user. Also to print and sum their squares.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class SumNumbers {

    public static void main(String[] args) {
        // create required variables
        Scanner kbd = new Scanner(System.in);
        int num, sum, squaredSum;

        // get user's number
        System.out.println();
        System.out.print("Enter a number: ");
        num = kbd.nextInt();
        kbd.nextLine();

        // print numbers from 1 to num
        sum = 0;
        squaredSum = 0;
        System.out.println("N" + "\t" +  "N^2");
        System.out.println("--" + "\t" + "--");
        for (int i = 1; i <= num; ++i) {
            System.out.println(i + "\t" + i * i);
            sum += i;
            squaredSum += i * i;
        }

        // print footer and sum
        System.out.println("--" + "\t" + "--");
        System.out.println(sum + "\t" + squaredSum);
        System.out.println();
    }

}
