package l07;

/**
 * A data-type class representing a hockey player. Just a name and a number of
 * goals.
 *
 * @author Aitezaz Siddiqi (A00431079)
 * @author Mark Young (A00000000)
 */
public class Player {

    // ---------- Instance variables ----------------------------------- //
    private String name;
    private int goals;

    // ---------- Constructors ----------------------------------------- //
    /**
     * Create a Player object with the given name and number of goals.
     *
     * @param initialName the requested name of the newly created player
     * @param initialGoals the requested number of goals for the new player
     */
    public Player(String initialName, int initialGoals) {
        // accept any name
        name = initialName;
        // do not allow any negative amounts for the goals
        goals = Math.max(initialGoals, 0);
    }

    /**
     * Create a Player object with the given name and no goals.
     *
     * @param initialName the requested name of the newly created player
     */
    Player(String initialName) {
        this.name = initialName;
        this.goals = 0;
    }

    /**
     * Create a Player object with a default name and no goals.
     */
    Player() {
        this.name = "(To be named later)";
        this.goals = 0;
    }

    // ---------- Getters ---------------------------------------------- //
    /**
     * Get the name of this Player.
     *
     * @return this Player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the number of goals this Player has scored.
     *
     * @return goals
     */
    public int getGoals() {
        return goals;
    }

    // ---------- Setters ---------------------------------------------- //
    /**
     * Change the name of this player.
     *
     * @param newName Player's new name
     */
    void setName(String newName) {
        this.name = newName;
    }

    /**
     * Change the number of goals for this Player. Requests to change the number
     * of goals to a negative value are silently ignored.
     *
     * @param newGoals the new number of goals
     */
    void setGoals(int newGoals) {
        if (newGoals > 0) {
            this.goals = newGoals;
        } else {
            this.goals = 0;
        }
    }

    // ---------- Other methods ---------------------------------------- //
    /**
     * Print a this Player's name and number of goals to System.out.
     */
    public void print() {
        System.out.print(name + " (" + goals + " goals)");
    }

    /**
     * Create a String to represent this Player. The string consists of the
     * Player's name followed by the number of goals this player has (in
     * parentheses) -- just as in the print command.
     *
     * @return a String representing this Player
     */
    public String toString() {
        return (name + " (" + goals + " goals)");
    }
}
