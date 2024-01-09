
public class Calendar {    
    static int dayOfMonth = 1;   
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2;     
    static int nDaysInMonth = 31; 
    
        public static void main(String args[]) {
       int newyear = Integer.parseInt(args[0]);
    int debugDaysCounter = 0;
    int sundays = 0; 

     while (true) {
            advance();

            debugDaysCounter++;

            if (dayOfMonth == 1 && month == 1 && year == newyear) {
                break;
            }
        }
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

            if (dayOfMonth == 1 && month == 1 && year == (newyear + 1)) {
                break;
            }
        }
    }

    
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
    } else if ((month == 2) && (dayOfMonth == 28) && (isLeapYear(year) == false)) {
        month++;
        dayOfMonth = 1;
    } else if (isLeapYear(year) && month == 2 && dayOfMonth == 29) {
        month++;
        dayOfMonth = 1;
    } else {
        dayOfMonth++;}

        dayOfWeek = (dayOfWeek % 7) + 1;  
    
}


    
    private static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }


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

