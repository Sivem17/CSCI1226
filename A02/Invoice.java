/**
 * A program that prints an invoice.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
package a02;

import java.util.Scanner;


public class Invoice {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

//create variables
        int number_first, number_second;
        double price_first, price_second, total_first_cost,
                total_second_cost, total_cost;

//introduce itself
        System.out.println("Order Two Things(TM) Co, Ltd Invoice Program");
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("This program lets you enter a customer's "
                + "order and then prints an invoice \nfor that customer");
        System.out.println();
        System.out.println("Author: AITEZAZ SIDDIQI (A00431079)");
        System.out.println("Produced for: CSCI 1226 (FALL 2018) A02");
        System.out.println();
        System.out.println("Press enter...");
        kbd.nextLine();

//get user input
        System.out.print("What is the customer's name? ");

        String customer_name;
        customer_name = kbd.nextLine();

        System.out.println();
        System.out.print("What is the first item the customer ordered? ");
        String first_item;
        first_item = kbd.nextLine();

        System.out.print("What is the second item the customer ordered? ");
        String second_item;
        second_item = kbd.nextLine();

        System.out.println();
        System.out.print("How many " + first_item + " do they want? ");
        number_first = kbd.nextInt();

        System.out.print("How many " + second_item + " do they want? ");
        number_second = kbd.nextInt();

        System.out.println();
        System.out.print("What is the price of a " + first_item + "? ");
        price_first = kbd.nextDouble();

        System.out.print("What is the price of a " + second_item + "? ");
        price_second = kbd.nextDouble();
        kbd.nextLine();
        
        System.out.println();
        System.out.print("Press enter...");
        kbd.nextLine();
        System.out.println();

//calculation
        total_first_cost = number_first * price_first;
        total_second_cost = number_second * price_second;
        total_cost = total_first_cost + total_second_cost;

//report results
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("Deliver to: " + customer_name);
        System.out.println("-----------------------------------------");

        System.out.printf(+number_first + " units of " + first_item
                + " at $" + price_first + " per unit: $"
                + "%.2f", total_first_cost);
        
        System.out.println();
        System.out.printf(+number_second + " units of " + second_item
                + " at $" + price_second + " per unit: $"
                + "%.2f", total_second_cost);
        
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.printf("Total price for this invoice: $" 
                + "%.2f", total_cost);
        System.out.println();
        System.out.println("-----------------------------------------");
        
        // TODO code application logic here
    }

}
