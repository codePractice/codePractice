package baekjun.greedyAlgorithm;

import java.util.Scanner;

public class P5585 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();

		int jandon = 1000 - money;

		int count = 0;
		
		count += jandon / 500;
		jandon %= 500;
		
		
		count += jandon / 100;
		jandon %= 100;

		
		count += jandon / 50;
		jandon %= 50;
		
		count += jandon / 10;
		jandon %= 10;
		

		count += jandon / 5;
		jandon %= 5;
		
		count += jandon / 1;
		jandon %= 1;
		
		
		
		System.out.println(count);
	}

}
