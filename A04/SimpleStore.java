package a04;

import java.util.Scanner;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class SimpleStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        //DECLARING INT
        int numberofFirstObject, numberofSecondObject, numberofThirdObject,
                requiredAge;

        //DECLARING CONSTANT DOUBLE
        final double rateofFirstObject, rateofSecondObject, rateofThirdObject;
        rateofFirstObject = 0.99;
        rateofSecondObject = 2.99;
        rateofThirdObject = 8.99;

        //DECLARING DOUBLE
        double PriceofFirstObject, PriceofSecondObject, PriceofThirdObject,
                totalPrice, discountAmount, discountedPrice,
                totalDiscountedPrice;

        //DECLARING CONSTANT STRING
        final String FirstObject, SecondObject, ThirdObject;
        FirstObject = "'Pencil'";
        SecondObject = "'Eraser'";
        ThirdObject = "'Package of paper'";

        // INTRODUCTION
        System.out.println("Simple Store Receipt Printer");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("by Aitezaz Siddiqi (A00431079)");
        System.out.println();

        //PAUSE
        System.out.print("Press enter...");
        kbd.nextLine();
        System.out.println();

        //USER INPUT FOR PENCIL
        System.out.print("Rate of per " + FirstObject + " is $"
                + rateofFirstObject
                + ". How many " + FirstObject + " do you want? ");
        numberofFirstObject = kbd.nextInt();
        kbd.nextLine();
        //IF USER INPUT NEGATIVE NUMBER
        if (numberofFirstObject < 0) {
            numberofFirstObject = 0;
            System.out.println("You can't order a negative number of items!");
        }

        //USER INPUT FOR ERASER
        System.out.print("Rate of per " + SecondObject + " is $"
                + rateofSecondObject
                + ". How many " + SecondObject + " do you want? ");
        numberofSecondObject = kbd.nextInt();
        //IF USER INPUT NEGATIVE NUMBER
        if (numberofSecondObject < 0) {
            numberofSecondObject = 0;
            System.out.println("You can't order a negative number of items!");
        }

        //USER INPUT FOR PACKAGES OF PAPER
        System.out.print("Rate of per"
                + " " + ThirdObject + " is $" + rateofThirdObject
                + ". How many " + ThirdObject + " do you want? ");
        numberofThirdObject = kbd.nextInt();
        //IF USER INPUT NEGATIVE NUMBER
        if (numberofThirdObject < 0) {
            numberofThirdObject = 0;
            System.out.println("You can't order a negative number of items!");
        }
        System.out.println();
        kbd.nextLine();

        //PAUSE
        System.out.print("Press enter...");
        kbd.nextLine();
        System.out.println();

        //ASKS FOR AGE IF USER BUYS ANYTHING
        if (numberofFirstObject == 0 && numberofSecondObject == 0
                && numberofThirdObject == 0) {
            System.out.println();
            System.out.println("Thank-you! Please come again!");
        } else {
            System.out.print("How old are you? ");
            requiredAge = kbd.nextInt();
            System.out.println();

            //CALCULATION FOR PRICE
            PriceofFirstObject = rateofFirstObject * numberofFirstObject;
            PriceofSecondObject = rateofSecondObject * numberofSecondObject;
            PriceofThirdObject = rateofThirdObject * numberofThirdObject;
            totalPrice = PriceofFirstObject + PriceofSecondObject
                    + PriceofThirdObject;

            //DISCOUNT CALCULATION FOR APPROPRIATE AGE
            if (requiredAge < 55) {
                discountAmount = 0;
            } else if (requiredAge >= 55 && requiredAge < 75) {
                discountAmount = 0.10;
            } else {
                discountAmount = 0.25;
            }
            discountedPrice = totalPrice * discountAmount;
            totalDiscountedPrice = totalPrice - discountedPrice;

            //PRINTING RECEIPT
            System.out.println("Customer Receipt");
            System.out.println("----------------");

            //PRINTS PRICE FOR PENCIL IF APPROPRIATE
            if (numberofFirstObject > 0) {
                System.out.println();
                System.out.printf( + numberofFirstObject + " " + FirstObject
                        + " at "
                        + "$" + rateofFirstObject + " each:     "
                        + "$" + "%.3f", PriceofFirstObject);
            }
            //PRINTS PRICE FOR ERASER IF APPROPRIATE
            if (numberofSecondObject > 0) {
                System.out.println();
                System.out.printf( + numberofSecondObject + " " + SecondObject
                        + " at "
                        + "$" + rateofSecondObject + " each:     "
                        + "$" + "%.3f", PriceofSecondObject);
            }
            //PRINTS PRICE FOR PACKAGES OF PAPER IF APPROPRIATE
            if (numberofThirdObject > 0) {
                System.out.println();
                System.out.printf( + numberofThirdObject + " "
                        + ThirdObject + " "
                        + "at $" + rateofThirdObject + " each:     "
                        + "$" + "%.3f", PriceofThirdObject);
            }

            //PRINTS TOTAL PRICE AND TOTAL DISCOUNTED PRICE IF APPROPRIATE
            if (requiredAge >= 55 && requiredAge < 75) {
                System.out.println();
                System.out.printf("Total regular price:     $"
                        + "%.3f", totalPrice);
                System.out.println();
                System.out.println("Discount at 10%:     $"
                        + String.format("%.03f", discountedPrice));
                System.out.printf("Total discounted price:     $"
                        + "%.3f", totalDiscountedPrice);
                System.out.println();
            } else if (requiredAge >= 75) {
                System.out.println();
                System.out.printf("Total regular price:     $"
                        + "%.3f", totalPrice);
                System.out.println();
                System.out.println("Discount at 25%:     $"
                        + String.format("%.03f", discountedPrice));
                System.out.printf("Total discounted price:     $"
                        + "%.3f", totalDiscountedPrice);
                System.out.println();
            } else {
                System.out.println();
                System.out.printf("Total regular price:     $"
                        + "%.3f", totalPrice);
                System.out.println();
            }
        }
    }
}
