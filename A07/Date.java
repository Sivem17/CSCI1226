package a07;

/**
 *
 * @author s3607751
 */
class Date {

    private int reqYear, reqMonth, reqDay, numOfDaysThisMonth, leapYear;
    
    private static boolean isValid(int year,int month,int day){
        if ((month >= 1 && month <= 12)) {
            reqMonth = month;
        } else {
            System.out.println("Could not create date "
                    + year + "-" + month + "-" + day);
            
        }
    }

    /**
     * Creates a date object with the given year, month and day.
     *
     * @param year the requested year
     * @param month the requested month
     * @param day the requested day
     */
    public Date(int year, int month, int day) {
        //ACCEPT YEAR
        reqYear = year;
        //ACCEPT MONTH
        reqMonth = month;
        //ACCEPT DAY
        reqDay = day;
    }

    /**
     *
     * @return numYear
     */
    public int getYear() {
        return reqYear;
    }

    /**
     *
     * @return numMonth
     */
    public int getMonth() {
        return reqMonth;
    }

    /**
     *
     * @return numDay
     */
    public int getDay() {
        return reqDay;
    }

    public void setYear(int year) {
        reqYear = year;
    }

    public void setMonth(int month) {
        reqMonth = month;
    }

    public void setDay(int day) {
        reqDay = day;
    }

    /**
     *
     * @return numOfDaysThisMonth
     */
    public int daysThisMonth() {
        return numOfDaysThisMonth;
    }

    /**
     *
     * @return leapYear
     */
    public int isLeapYear() {
        return leapYear;
    }

}
