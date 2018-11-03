package a06;

/**
 *
 * @author Aitezaz Siddiqi (A00431079)
 */
public class GradeDistribution {

    //DECLARING INSTANCE VARIABLE
    private int numA, numB, numC, numD, numF, total;

    /**
     * 
     * @param numberGrade is given a condition in which it will show number of each variables.
     */
    //METHOD FOR CONVERTING NUMBERS INTO GRADES    
    public void addGrade(int numberGrade) {
        if (numberGrade >= 80) {
            numA++;
        } else if (numberGrade >= 70) {
            numB++;
        } else if (numberGrade >= 60) {
            numC++;
        } else if (numberGrade >= 50) {
            numD++;
        } else {
            numF++;
        }
        total = numA + numB + numC + numD + numF;

    }
    /**
     * 
     * @return numA
     */
    //GETTER RETURNS numA
    public int getAs() {
        return numA;
    }
    /**
     * 
     * @return percentage of grade A
     */
    public double percentAs() {
        return numA / (double) total * 100;
    }
    /**
     * 
     * @return numB
     */
    public int getBs() {
        return numB;
    }
    /**
     * 
     * @return percentage of grade B
     */
    public double percentBs() {
        return numB / (double) total * 100;
    }
    /**
     * 
     * @return numC
     */
    public int getCs() {
        return numC;
    }
    /**
     * 
     * @return percentage of grade C
     */
    public double percentCs() {
        return numC / (double) total * 100;
    }
    /**
     * 
     * @return numD
     */
    public int getDs() {
        return numD;
    }
    /**
     * 
     * @return percentage of grade D
     */
    public double percentDs() {
        return numD / (double) total * 100;
    }
    /**
     * 
     * @return numF
     */
    public int getFs() {
        return numF;
    }
    /**
     * 
     * @return percentage of grade F
     */
    public double percentFs() {
        return numF / (double) total * 100;
    }
    /**
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }
    /**
     * Method for printing the bar graph.
     */
    public void print() {
        //LOOP FOR PRINTING THE 1ST PART OF SCALE
        System.out.println();
        for (int x = 0; x <= 100; x = x + 10) {
            System.out.print(x);
            for (int i = 1; i <= 5; i++) {
                System.out.print(" ");
            }
        }
        //LOOP FOR PRINTING THE 2ND PART OF SCALE
        System.out.println();
        for (int j = 0; j <= 100; j = j + 10) {
            System.out.print("|");
            for (int k = 1; k <= 6 && j != 100; k++) {
                System.out.print("_");
            }
        }
        System.out.println();
        
        System.out.print("A");
        for (int i = 0; i < ((numA / (double) total * 100) * 6 / 10); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("B");
        for (int i = 0; i < ((numB / (double) total * 100) * 6 / 10); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("C");
        for (int i = 0; i < ((numC / (double) total * 100) * 6 / 10); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("D");
        for (int i = 0; i < ((numD / (double) total * 100) * 6 / 10); i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("F");
        for (int i = 0; i < ((numF / (double) total * 100) * 6 / 10); i++) {
            System.out.print("*");
        }
    }
    /**
     * Method for resetting all the variables.
     */
    public void reset() {
        numA = 0;
        numB = 0;
        numC = 0;
        numD = 0;
        numF = 0;
    }

}
