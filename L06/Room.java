package l06;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class Room {

    //DECLARING INSTANCE VARIABLES
    private String roomName;
    private int roomNumber;

    //A CONSTRUCTOR FOR ROOM DATA TYPE
    public Room(String reqBuilding, int reqNumber) {

        //CHANGES THE ROOM NAME TO ALL UPPER CASE
        roomName = reqBuilding.toUpperCase();

        /*LOOP FOR SETTING THE VALUE TO 0 
        IF NEGATIVE NUMBER IS ENTERED*/
        if (roomNumber >= 0) {
            roomNumber = reqNumber;
        } else {
            roomNumber = 0;
        }
    }

    //GETTER - RETURNS ROOM NAME
    public String getBuilding() {
        return roomName;
    }

    //GETTER - RETURNS ROOM NUMBER
    public int getNumber() {
        return roomNumber;
    }

    /*BUILDING SETTER: CHANGES THE 
    NAME TO ALL UPPER CASE*/
    public void setBuilding(String reqBuilding) {
        roomName = reqBuilding.toUpperCase();
    }

    //ROOM NUMBER SETTER
    public void setNumber(int reqNumber) {

        /*LOOP SHOWING ERROR 
        IF NEGATIVE NUMBER IS ENTERED*/
        if (reqNumber >= 0) {
            roomNumber = reqNumber;
        } else {
            System.out.println("Illegal room number: " + reqNumber);
        }
    }

}
