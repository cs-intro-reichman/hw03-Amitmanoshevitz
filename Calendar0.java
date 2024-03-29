
public class Calendar0 {	
	
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	
	private static void nDaysInMonthTest(int year) {
		for (int month = 1; month <= 12; month++) {
			int daysInMonth = nDaysInMonth(month, year);
			System.out.println("Month " + month + " has " + daysInMonth + " days");
		}
	}

	
	public static boolean isLeapYear(int year) {
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