/**
 * A program to calculate the radius, area of a circle
 * and the distance between two points.
 *
 * @author Mark Young (A00000000)
 * @author Aitezaz Siddiqi (A00431079)
 */
package l02a;

import java.util.Scanner;

public class MoreMath {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        // declare required variables
        
        double radius, area;
        int x1, y1, x2, y2;
        double distance;

        // Get and show circle data
        
        System.out.print("Enter the radius of a circle: ");

        radius = kbd.nextDouble();
        kbd.nextLine();

        // TODO: should be pi times radius squared
        
        area = Math.pow(radius, 2) * Math.PI;

        System.out.println();
        System.out.println("Circle Measurements");
        System.out.println();
        System.out.println("    Radius: " + radius + " cm");
        System.out.println("    Area:   " + area + " cm squared");

        System.out.println();
        System.out.print("Press Enter...");
        kbd.nextLine();
        
        // Get and show point data
        
        System.out.println();
        System.out.print("Enter the co-ordinates of the first point: ");

        x1 = kbd.nextInt();
        y1 = kbd.nextInt();

        System.out.print("Enter the co-ordinates of the second point: ");

        x2 = kbd.nextInt();
        y2 = kbd.nextInt();
        kbd.nextLine();
        
        distance = Math.sqrt(Math.pow((x1 - x2), 2) + 
                Math.pow((y1 - y2), 2));

        
        System.out.println();
        System.out.println("Point Measurements");
        System.out.println();
        System.out.println("    Point 1: (" + x1 + ", " + y1 + ")");
        System.out.println("    Point 2: (" + x2 + ", " + y2 + ")");
        System.out.printf("    Distance: " + "%.1f", distance);
        System.out.println();

        System.out.println();
        System.out.print("Press Enter...");
        kbd.nextLine();
    }
}
