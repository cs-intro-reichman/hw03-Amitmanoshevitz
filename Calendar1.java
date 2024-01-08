/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {    
    // Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;   
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January
    
    /** 
     * Prints the calendars of all the years in the 20th century. Also prints the  
     * number of Sundays that occured on the first day of the month during this period.
     */
        public static void main(String args[]) {
        // Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
        // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
        // The following variable, used for debugging purposes, counts how many days were advanced so far.
      
    int debugDaysCounter = 0;
    int sundays = 0; 

    while (true) {
        System.out.print(dayOfMonth + "/" + month + "/" + year);

        if (dayOfWeek == 1 && dayOfMonth == 1) { 
            sundays++;
        }
        if(dayOfWeek == 1){
             System.out.print(" Sunday");
        }

        System.out.println();
        advance();

        debugDaysCounter++;

        if (dayOfMonth == 1 && month == 1 && year == 2000) {
            break;
        }
    
        }System.out.println("During the 20th century, " + sundays + " Sundays fell on the first day of the month");
}
    // Advances the date (day, month, year) and the day-of-the-week.
    // If the month changes, sets the number of days in this month.
    // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
   private static void advance() {
    if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && dayOfMonth == 31) {
        month++;
        dayOfMonth = 1;
    } else if ((month == 4 || month == 6 || month == 9 || month == 11) && dayOfMonth == 30) {
        month++;
        dayOfMonth = 1;
    } else if (month == 12 && dayOfMonth == 31) {
        month = 1;
        dayOfMonth = 1;
        year++;
    } else if (!isLeapYear(year) && month == 2 && dayOfMonth == 28) {
        month++;
        dayOfMonth = 1;
    } else if (isLeapYear(year) && month == 2 && dayOfMonth == 29) {
        month++;
        dayOfMonth = 1;
    } else {
        dayOfMonth++;}

        dayOfWeek = (dayOfWeek % 7) + 1;  
    
}


    // Returns true if the given year is a leap year, false otherwise.
    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    // Returns the number of days in the given month and year.
    // April, June, September, and November have 30 days each.
    // February has 28 days in a common year, and 29 days in a leap year.
    // All the other months have 31 days.
    // Returns the number of days in the given month and year.
    public static int nDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                return 29;
                } else {
                return 28;
                }
            default:
                return -1; 
        }
    }
}

