package l09;

import java.util.Scanner;
import java.util.Random;

/**
 * A program to simulate playing "Chutes/Snakes and Ladders". Players roll the
 * dice and advance along a track. Some spaces on the track have chutes (slides;
 * snakes in some games) that the player slides down to an earlier space. Some
 * spaces on the track have ladders that lead up to a later space, which the
 * player climbs.
 *
 * The first player to the end of the track is the winner.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class ChutesAndLadders {

    // class constants (any program only need one of each of these)
    private static final Scanner KBD = new Scanner(System.in);
    private static final Random RAND = new Random();

    // class constants (game settings)
    private static final int NUM_SPACES = 10;
    private static final int NUM_PLAYERS = 3;
    private static final int DIE = 6;

    public static void main(String[] args) {
        // create required variables
        int[] board;
        int[] position;
        int currentPlayer = 0;

        // set up the game
        board = makeBoard();
        position = new int[NUM_PLAYERS];

        // introduce yourself
        printIntroduction();
        pause();

        // keep rolling until someone gets to end
        while (position[currentPlayer] < NUM_SPACES) {
            // roll and announce roll
            int roll = rollDie();
            System.out.println("Player " + currentPlayer + " rolls " + roll);

            // advance player to new position
            position[currentPlayer] = position[currentPlayer] + roll;
            if (position[currentPlayer] > NUM_SPACES) {
                position[currentPlayer] = NUM_SPACES;
            }
            System.out.println("Player " + currentPlayer + " reaches " + position[currentPlayer]);

            if (position[currentPlayer] >= NUM_SPACES) {
                break;
            }

            // look for chutes and/or ladders
            while (board[position[currentPlayer]] != position[currentPlayer]) {
                if (board[position[currentPlayer]] < position[currentPlayer]) {
                    // going down -- a chute
                    position[currentPlayer] = board[position[currentPlayer]];
                    System.out.println("Player " + currentPlayer + " slides down a chute to "
                            + position[currentPlayer]);
                } else {
                    // going up -- a ladder
                    position[currentPlayer] = board[position[currentPlayer]];
                    System.out.println("Player " + currentPlayer + " climbs up a ladder to "
                            + position[currentPlayer]);
                }
            }

            // pause after each turn
            pause();
            if (currentPlayer < NUM_PLAYERS - 1) {
                currentPlayer++;
            } else {
                currentPlayer = 0;
            }
        }

        // announce winner
        System.out.println("Player " + currentPlayer + " wins!");
    }

    private static void printIntroduction() {
        System.out.println("We're going to play Chutes and ladders!");
    }

    private static void pause() {
        System.out.println();
        System.out.print("...press enter...");
        KBD.nextLine();
        System.out.println();
    }

    private static int rollDie() {
        return RAND.nextInt(DIE) + 1;
    }

    private static int[] makeBoard() {
        int[] board = new int[NUM_SPACES + DIE];
        for (int i = 0; i < board.length; i++) {
            board[i] += i;
            board[3] = 7;
            board[9] = 6;
        }
        board[NUM_SPACES] = NUM_SPACES;
        return board;
    }

}
