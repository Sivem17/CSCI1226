package l07;

import java.util.Scanner;

/**
 * A program to test the data-type class Player.
 * 
 * @author Krystian Dudzinski (A11111111)
 * @author Mark Young (A00000000)
 */
public class GetPlayers {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String name;
        int goals;
        Player veteran, rookie, draftPick;

        // introduce yourself
        System.out.print("\n\n"
                + "Get Players\n"
                + "-----------\n\n");

        // get a veteran player
        System.out.print("What is your veteran player's name? ");
        name = kbd.nextLine();
        System.out.print("How many goals does he have? ");
        goals = kbd.nextInt();
        kbd.nextLine();
        System.out.println();
        veteran = new Player(name, goals);

        
        // get a rookie
        System.out.print("What is your new player's name? ");
        name = kbd.nextLine();
        System.out.println();
        rookie = new Player(name);

        // get a draft pick
        System.out.println("(You also get a draft pick!)\n");
        draftPick = new Player();

        // print first report
        System.out.println("Your team:");
        System.out.println("\t" + veteran.getName() + " has " 
                + veteran.getGoals() + " goals.");
        System.out.println("\t" + rookie.getName() + " has " 
                + rookie.getGoals() + " goals.");
        System.out.println("\t" + draftPick.getName() + " has " 
                + draftPick.getGoals() + " goals.");
        System.out.println();

        
        // revise Players
        System.out.println(veteran.getName() + " scored some goals!");
        veteran.setGoals(veteran.getGoals() + 2);
        System.out.print("\t");
        veteran.print();
        System.out.println();
        System.out.println(rookie.getName() + " scored some goals!");
        rookie.setGoals(5);
        System.out.print("\t");
        rookie.print();
        System.out.println();
        System.out.println("They've named your draft pick!");
        draftPick.setName("Auston");
        draftPick.setGoals(-10);
        System.out.print("\t");
        draftPick.print();
        System.out.println();
        System.out.println();


        // print team report
        System.out.println("Your team:");
        System.out.println("\t" + veteran);
        System.out.println("\t" + rookie);
        System.out.println("\t" + draftPick);
        System.out.println();
    }

}
