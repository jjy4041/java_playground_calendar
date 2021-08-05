package srv.calendar;

import java.util.Scanner;

public class Prompt {

	private static final String PROMPT = "cal> ";

	/**
	 * 
	 * @param week 요일명
	 * @return 0 ~ 6 ( SUN ~ SAT)
	 */
	public int parseDay(String week) {
		if(week.equals("SU") ) {
			return 0;
		} else if(week.equals("MO")) {
			return 1;
		} else if(week.equals("TU")) {
			return 2;
		} else if(week.equals("WD")) {
			return 3;
		} else if(week.equals("TH")) {
			return 4;
		} else if(week.equals("FR")) {
			return 5;
		} else if(week.equals("SA")) {
			return 6;
		} else {
			return 0;
		}
	}
	
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);

		int year = 0;
		int month = 0;
		int weekday = 0;
		
		while (true) {
			System.out.println("원하는 년도를 숫자만 입력해주세요!");
			System.out.println("YEAR> ");
			year = scanner.nextInt();
			
			System.out.println("원하는 달을 숫자만 입력해주세요!");
			System.out.println("MONTH> ");
			month = scanner.nextInt();
			
			System.out.println("첫째날의 요일을 입력해주세요 !");
			System.out.println("SU MO TU WD TH FR SA");
			System.out.println("DAY> ");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month, weekday);
		}
		scanner.close();
	}

	public static void main(String[] args) {

		// Shell 실행
		Prompt prompt = new Prompt();
		prompt.runPrompt();
	}

}
