package baekjun;

import java.io.IOException;
import java.util.Scanner;

public class PracticeImpl {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		

		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		
		int[] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] dayOftheWeeks = {"SUN","MON","TUE","WED","THU","FRI","SAT","SUN"};
		
		int total = day;
		
		
		for(int i =0; i < month-1; i++) {
			total += dayInMonth[i];
		}
		
		System.out.println(dayOftheWeeks[total%7]);
		

	}

}
