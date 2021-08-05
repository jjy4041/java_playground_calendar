package srv.calendar;

public class Calendar {
	
	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0  ) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getMaxDays(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}
	
	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("      <<%4d %3d月>>\n", year, month);
		System.out.println("      일          월          화        수         목        금        토");
		System.out.println("========================================");
		for(int i = 0; i < weekday; i++) {
			System.out.print("     ");
		}
		int maxDay = getMaxDays(year, month);
		
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%5d", i);
			if ( (i+weekday) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		
	}
	
	

}
