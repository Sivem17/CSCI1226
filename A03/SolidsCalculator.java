/**
 * A program  for area and volume computation.
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
package a03;

import java.util.Scanner;
import java.util.Random;

public class SolidsCalculator {
   
    
    public static void main(String[] args) {
       
        Scanner kbd = new Scanner(System.in);
        Random r = new Random();
        
        //CREATE VARIABLES
        int lower_sphere, upper_sphere, random_lower_radius_cylinder, 
                random_upper_radius_cylinder, random_lower_height_cylinder, 
                random_upper_height_cylinder;
        
        double random_radius, volume_sphere, area_sphere,
                radius_cylinder, height_cylinder, 
                volume_cylinder, area_cylinder;
        
        //INTRODUCE
        System.out.println("By Aitezaz Ashowar Siddiqi -- A00431079");
        System.out.println("Produced for: CSCI 1226 -- Fall 2018");
        System.out.println("Assignment A03 -- due 2018-09-28");
        
        //PAUSE
        System.out.println();
        System.out.println("Press Enter.....");
        kbd.nextLine();
        
        //SPHERE
        System.out.println("SPHERE");
        System.out.println("------");
        System.out.println();
        
        //TAKES IN LOWER LIMIT
        System.out.print("Enter the lower limit for sphere radius: ");
        lower_sphere = kbd.nextInt();
        kbd.nextLine();
        
        //TAKES IN UPPER LIMIT
        System.out.print("Enter the upper limit for sphere radius: ");
        upper_sphere = kbd.nextInt();
        kbd.nextLine();
        System.out.println();
        
        //RANDOMIZES BETWEEN LOWER AND UPPER LIMIT
        random_radius = r.nextInt((upper_sphere - lower_sphere) + 1)
                + lower_sphere;
        System.out.print("Random radius for the sphere: " + random_radius);
        kbd.nextLine();
        
        //CALCULATES VOLUME OF SPHERE AND PAUSES
        volume_sphere = Math.PI * Math.pow(random_radius, 3) * 4 / 3;
        System.out.printf("Volume of the sphere: " + "%.2f", volume_sphere);
        kbd.nextLine();
        
        //CALCULATES AREA OF SPHERE AND PAUSES
        area_sphere = 4 * Math.PI * Math.pow(random_radius, 2);
        System.out.printf("Area of the sphere: " + "%.2f", area_sphere);
        kbd.nextLine();
        System.out.println();
        
        //PAUSE
        System.out.print("Press Enter....");
        kbd.nextLine();
        System.out.println();
        
        //CYLINDER
        System.out.println("CYLINDER");
        System.out.println("--------");
        System.out.println();
        
        //TAKES IN LOWER LIMIT
        System.out.print("Enter the lower limit for cylinder radius and "
                + "height: ");
        random_lower_radius_cylinder = kbd.nextInt();
        random_lower_height_cylinder = kbd.nextInt();
        kbd.nextLine();
        
        //TAKES IN UPPER LIMIT
        System.out.print("Enter the upper limit for cylinder radius and "
                + "height: ");
        random_upper_radius_cylinder = kbd.nextInt();
        random_upper_height_cylinder = kbd.nextInt();
        kbd.nextLine();
        System.out.println();
        
        //RANDOMIZES THE RADIUS
        radius_cylinder = r.nextInt((random_upper_radius_cylinder - 
                random_lower_radius_cylinder) + 1)
                + random_lower_radius_cylinder;
        System.out.print("Random radius of the cylinder: " + radius_cylinder);
        kbd.nextLine();
        
        //RANDOMIZES THE HEIGHT
        height_cylinder = r.nextInt((random_upper_height_cylinder - 
                random_lower_height_cylinder) + 1)
                + random_lower_height_cylinder;
        System.out.print("Random height of the cylinder: " + height_cylinder);
        kbd.nextLine();
        
        //CALCULATES VOLUME OF CYLINDER AND PAUSES
        volume_cylinder = Math.PI * Math.pow(radius_cylinder, 2) 
                * height_cylinder;
        System.out.printf("Volume of the cylinder: " +
                "%.2f", volume_cylinder);
        kbd.nextLine();
        
        //CALCULATES AREA OF CYLINDER AND PAUSES
        area_cylinder = 2 * Math.PI * radius_cylinder * height_cylinder 
                + 2 * Math.PI * Math.pow(radius_cylinder, 2);
        System.out.printf("Surface area of the cylinder: " +
                "%.2f", area_cylinder);
        kbd.nextLine();
        
        //PAUSE
        System.out.println();
        System.out.print("Press Enter....");
        kbd.nextLine();
        System.out.println();
        
    }
    
}
