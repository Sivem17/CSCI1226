package a09;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class BattleHorses {

    private static final Scanner KBD = new Scanner(System.in);
    private static final Random R = new Random();

    private static final int DIE = 6;
    private static final int NUM_SPACES = 10;
    private static int NUM_HORSES;

    public static void main(String[] args) {

        int[] board;
        int[] position;
        int roll;
        int rHorse;
        int newPosition;

        printIntro();
        getValidNumOfHorses();
        String[] nameHorses = getHorsesName();

        board = makeBoard();
        position = new int[NUM_HORSES];

        System.out.print("\nThey're in the starting gate!\n\nPrese ENTER after "
                + "each horse's turn.\nPress ENTER to start the race...");
        KBD.nextLine();
        System.out.println();

        int posOfLeader;
        rHorse = R.nextInt(NUM_HORSES) + 1;
        System.out.println("which horse " + rHorse);

        while (position[rHorse - 1] < NUM_SPACES) {
            roll = rollDie();
            System.out.println("what roll " + roll);
            newPosition = position[rHorse - 1] + roll;
            board[newPosition - roll] = -1;
            if (board[newPosition] == -1) {
                posOfLeader = position[rHorse - 1];
                position[rHorse - 1] = newPosition;
                board[newPosition] = position[rHorse - 1];
                System.out.println(nameHorses[rHorse - 1] + " rolls " + roll
                        + " ...  is at " + newPosition);
                if (newPosition > posOfLeader) {
                    //posOfLeader = newPosition;
                    System.out.println(nameHorses[rHorse - 1] + " is in the lead!");
                }
                System.out.println(board[position[rHorse - 1] - roll]);
                System.out.println(board[position[rHorse - 1]]);
            } else {
                System.out.print(nameHorses[rHorse - 1] + " rolls " + roll);
                while (board[newPosition] != - 1) {
                    newPosition = newPosition - 1;
                    System.out.print(" ... can't pass " + nameHorses[rHorse - 1]);
                }
                position[rHorse - 1] = newPosition;
                board[position[rHorse - 1]] = position[rHorse - 1];
                System.out.print(" ... is at " + position[rHorse - 1]);
                System.out.println();

            }

            printPause();
            if (rHorse < NUM_HORSES) {
                rHorse++;
            } else {
                rHorse = 1;
            }
        }
    }

    private static String[] getHorsesName() {
        int horseNumber = 1;
        String[] nameHorses = new String[NUM_HORSES];
        for (int i = 0; i < NUM_HORSES; i++) {
            System.out.print("What is horse #" + horseNumber + "'s name? ");
            nameHorses[i] = KBD.nextLine();
            horseNumber++;
        }
        return nameHorses;
    }

    private static void getValidNumOfHorses() {
        System.out.print("How many horses should be in this battle? ");
        NUM_HORSES = KBD.nextInt();
        KBD.nextLine();
        while (NUM_HORSES < 2 || NUM_HORSES > 16) {
            System.out.println("The number of horses must be between 2 and 16.");
            System.out.print("How many horses should be in this battle? ");
            NUM_HORSES = KBD.nextInt();
            KBD.nextLine();
        }
    }

    private static int rollDie() {
        return R.nextInt(DIE) + 1;
    }

    private static void printIntro() {
        System.out.println("Battle Horses\n-------------\n");
        System.out.println("by Aitezaz Siddiqi (A00431079)\n");
    }

    private static void printPause() {
        System.out.println();
        System.out.print("Press Enter...");
        KBD.nextLine();
        System.out.println();
    }

//    private static String[] getHorsesName() {
//        int currentHorse = 1;
//        String[] nameHorses = new String[NUM_HORSES];
//        for (int i = 0; i < NUM_HORSES; i++) {
//            System.out.print("What is horse #" + currentHorse + "'s name? ");
//            nameHorses[i] = KBD.nextLine();
//            currentHorse++;
//        }
//        return nameHorses;
//    }
    private static int[] makeBoard() {
        int[] board = new int[NUM_SPACES + DIE + 7];
        for (int i = 0; i <= board.length - 1; i++) {
            board[i] = -1;
        }
        //board[NUM_SPACES] = NUM_SPACES;
        return board;
    }
}
