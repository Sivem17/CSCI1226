package a07;

import java.util.Scanner;

/**
 * A program to test the Date data type class.
 *
 * DO NOT MODIFY THE CODE IN THIS FILE.
 *
 * You may delete the lines labeled "DELETE THIS LIEN when ...",
 * but should only do so when you have created all the required methods.
 *
 * @author Mark Young (A00000000)
 */
public class TestDate {

    // there should only be one Scanner connected to System.in
    private static final Scanner KBD = new Scanner(System.in);

    public static void main(String[] args) {
        // create required variables
        int year, month, day, bigDay;
        Date date1, date2;

        // print program title
        System.out.println("Tests for the Date class\n"
                         + "------------------------\n");

        // test getters (with constructor for "normal" dates
        System.out.println("Testing Getters:");
        date1 = new Date(2001, 1, 1);
        date2 = new Date(1932, 3, 17);
        testInt("year should be ", 2001, date1.getYear());
        testInt("month should be ", 1, date1.getMonth());
        testInt("day should be ", 1, date1.getDay());
        testInt("year should be ", 1932, date2.getYear());
        testInt("month should be ", 3, date2.getMonth());
        testInt("day should be ", 17, date2.getDay());
        pause();

        // test constructor for weird dates
        System.out.println("Testing Constructor:");
        date2 = new Date(2016, 0, 10);
        testInt("year should be ", 2001, date2.getYear());
        testInt("month should be ", 1, date2.getMonth());
        testInt("day should be ", 1, date2.getDay());
        date2 = new Date(2018, 13, 10);
        testInt("year should be ", 2001, date2.getYear());
        testInt("month should be ", 1, date2.getMonth());
        testInt("day should be ", 1, date2.getDay());
        date2 = new Date(2017, 3, 0);
        testInt("year should be ", 2001, date2.getYear());
        testInt("month should be ", 1, date2.getMonth());
        testInt("day should be ", 1, date2.getDay());
        date2 = new Date(2013, 3, 32);
        testInt("year should be ", 2001, date2.getYear());
        testInt("month should be ", 1, date2.getMonth());
        testInt("day should be ", 1, date2.getDay());
        date2 = new Date(2011, 2, 29);
        testInt("year should be ", 2001, date2.getYear());
        testInt("month should be ", 1, date2.getMonth());
        testInt("day should be ", 1, date2.getDay());
        date2 = new Date(2012, 2, 29);
        testInt("year should be ", 2012, date2.getYear());
        testInt("month should be ", 2, date2.getMonth());
        testInt("day should be ", 29, date2.getDay());
        pause();

/* DELETE THIS LINE when you have setters
        // test setYear
        System.out.println("Testing year setter");
        year = 2010;
        date1.setYear(year);
        testInt("year should be ", year, date1.getYear());
        year = 1066;
        date1.setYear(year);
        testInt("year should be ", year, date1.getYear());
        year = -4004;
        date1.setYear(year);
        testInt("year should be ", year, date1.getYear());
        date1.setYear(1000);
        pause();

        // test setMonth
        System.out.println("Testing month setter");
        month = 6;
        date1.setMonth(month);
        testInt("month should be ", month, date1.getMonth());
        date1.setMonth(0);
        testInt("month should be ", month, date1.getMonth());
        date1.setMonth(13);
        testInt("month should be ", month, date1.getMonth());
        date1.setMonth(month);
        pause();

        // test setDay
        System.out.println("Testing day setter");
        day = 17;
        date1.setDay(day);
        testInt("day should be ", day, date1.getDay());
        date1.setDay(32);
        testInt("day should be ", day, date1.getDay());
        date1.setDay(0);
        testInt("day should be ", day, date1.getDay());
        date1.setDay(day);
        day = 17;
        bigDay = 31;
        date1.setDay(day);
        date1.setMonth(1);  // January has 31 days
        date1.setDay(bigDay);
        testInt("day should be ", bigDay, date1.getDay());
        date1.setDay(day);
        date1.setMonth(4);  // April has only 30 days
        date1.setDay(bigDay);
        testInt("day should be ", day, date1.getDay());
        date1.setDay(day);
        bigDay = 30;
        date1.setDay(bigDay);
        testInt("day should be ", bigDay, date1.getDay());
        date1.setDay(day);
        date1.setYear(2010);    // not a leap year
        date1.setMonth(2);      // Feb has 28 days
        bigDay = 29;
        date1.setDay(bigDay);
        testInt("day should be ", day, date1.getDay());
        date1.setDay(day);
        date1.setYear(2040);    // leap year
        date1.setMonth(2);      // Feb has 29 days
        date1.setDay(bigDay);
        testInt("day should be ", bigDay, date1.getDay());
        pause();

        // test set
        System.out.println("Testing triple setter");
        year = 1961;
        month = 4;
        day = 16;
        date1.set(year, month, day);
        testInt("year should be ", year, date1.getYear());
        testInt("month should be ", month, date1.getMonth());
        testInt("day should be ", day, date1.getDay());
        date1.set(year, 13, day);
        testInt("year should be ", year, date1.getYear());
        testInt("month should be ", month, date1.getMonth());
        testInt("day should be ", day, date1.getDay());
        date1.set(year, month, -7);
        testInt("year should be ", year, date1.getYear());
        testInt("month should be ", month, date1.getMonth());
        testInt("day should be ", day, date1.getDay());
        date1.set(year, month, day);
        pause();

/* DELETE THIS LINE when you have daysThisMonth
        // Test daysThisMonth
        System.out.println("Testing days this month");
        int[] normalDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int m = 1; m <= 12; m++) {
            date1.setMonth(m);
            testInt("number of days should be ", 
                    normalDays[m], date1.daysThisMonth());
        }
        date1.setYear(4);
        date1.setMonth(2);
        testInt("number of days should be ", 29, date1.daysThisMonth());
        pause();

/* DELETE THIS LINE when you have isLeapYear
        // test isLeapYear
        System.out.println("Testing leap years");
        date1.setYear(40);
        testBoolean("isLeapYear should be ", true, date1.isLeapYear());
        date1.setYear(800);
        testBoolean("isLeapYear should be ", true, date1.isLeapYear());
        date1.setYear(123);
        testBoolean("isLeapYear should be ", false, date1.isLeapYear());
        date1.setYear(1700);
        testBoolean("isLeapYear should be ", false, date1.isLeapYear());
        pause();

/* DELETE THIS LINE (and one below) when you have toString
        // test toString
        System.out.println("Testing toString");
        year = 2010;
        month = 12;
        day = 25;
        date1.set(year, month, day);
        String myString = String.format("%4d-%02d-%02d", year, month, day);
        testString("date 1 should be ", myString, date1.toString());
        month = 6;
        date1.set(year, month, day);
        myString = String.format("%4d-%02d-%02d", year, month, day);
        testString("date 1 should be ", myString, date1.toString());
        month = 10;
        day = 9;
        date1.set(year, month, day);
        myString = String.format("%4d-%02d-%02d", year, month, day);
        testString("date 1 should be ", myString, date1.toString());
        pause();
DELETE THIS LINE when you have toString */
    }

    private static void pause() {
        System.out.println();
        System.out.println("If there are any FAIL messages above ...");
        System.out.println("... then end the program and fix your mistakes.");
        System.out.print("... otherwise, press enter...");
        KBD.nextLine();
        System.out.println();
    }

    private static void testInt(String s, int should, int is) {
        if (should != is) {
            System.out.println(s + should + ", is " + is + " -- FAIL");
        }
    }

    private static void testBoolean(String s, boolean should, boolean is) { 
        if (should != is) {
            System.out.println(s + should + ", is " + is + " -- FAIL");
        }
    }

    private static void testString(String s, String should, String is) { 
        if (!should.equals(is)) {
            System.out.println(s + should + ", is " + is + " -- FAIL");
        }
    }

}

