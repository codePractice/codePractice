package baekjun.middleLevel;

import java.util.Scanner;

public class P1541 {

		static String q;
		static int sum;
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		q = sc.next();
		
		String[] numbers = q.split("-");
		
		sc.close();
		
		sum += calculation(numbers[0]);
		
		for(int i = 1; i < numbers.length; i++) {
			sum -= calculation(numbers[i]);
		}
		
		System.out.println(sum);
		
		
	}
	
	
	public static int calculation(String number) {
	
		String[] array = number.split("\\+");
		
		int result = 0;
		
		for (String item : array) {
			result += Integer.parseInt(item);
		}
		
		return result;
	}

}
