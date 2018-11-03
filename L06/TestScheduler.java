package l06;

import java.util.Scanner;

/**
 * A program to test the Room class.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class TestScheduler {

    public static void main(String[] args) {
        // create variables
        Scanner kbd = new Scanner(System.in);
        Room ourRoom, theirRoom;
        String building;
        int number;

        // introduce yourself
        System.out.println("\n\n"
                + "Test Scheduler\n"
                + "--------------\n\n"
                + "Let's try to make sure "
                + "we don't put two tests in the same room!\n\n");

        // get our test's room number
        System.out.print("What room is our test in? ");
        building = kbd.next();
        number = kbd.nextInt();
        kbd.nextLine();
        ourRoom = new Room(building, number);

        // get their test's room number
        System.out.print("What room is their test in? ");
        building = kbd.next();
        number = kbd.nextInt();
        kbd.nextLine();
        theirRoom = new Room(building, number);

        // check the getters by reporting the room numbers
        System.out.println();
        System.out.println("Our test is in "
                + ourRoom.getBuilding() + " " + ourRoom.getNumber());
        System.out.println("Their test is in "
                + theirRoom.getBuilding() + " " + theirRoom.getNumber());
        System.out.println();

        // check if the two tests are in the same room
        if (ourRoom.getBuilding().equals(theirRoom.getBuilding())) {
            System.out.println("Our tests are in the same building.");
            if (ourRoom.getNumber() == theirRoom.getNumber()) {
                System.out.println("They're in the same room!");
            }
            System.out.println();
        }

        // check the setter with valid information
        theirRoom.setBuilding("S");
        theirRoom.setNumber(182);
        System.out.println("Their test has been moved to "
                + theirRoom.getBuilding() + " " + theirRoom.getNumber()
                + " (should be S 182)");

        // check the setter with invalid information
        theirRoom.setBuilding("l");  // YES -- leave it as lower case HERE
        theirRoom.setNumber(-177);
        System.out.println("Their test has been moved to "
                + theirRoom.getBuilding() + " " + theirRoom.getNumber()
                + " (should be L 182)");
        System.out.println();

        System.out.println();
    }
}
