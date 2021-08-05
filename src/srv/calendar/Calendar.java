package srv.calendar;

import java.util.Scanner;

public class Calendar {
	
	private final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static void main(String[] args) {
	
		Calendar cal = new Calendar();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요.");
		int repeat = scanner.nextInt();
		
		for(int i = 0; i < repeat; i++) {
			System.out.println("원하는 달을 숫자만 입력해주세요!");
			int month = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDays(month));
		}
		
		scanner.close();
	}
	
	public int getMaxDays(int month) {
		return MAX_DAYS[month - 1];
	}

}
