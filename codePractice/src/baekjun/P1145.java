package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1145 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}

		int x = 1;

		while (true) {

			int count = 0;

			for (int i = 0; i < 5; i++) {
				if (x % list.get(i) == 0)
					count++;
			}

			if (count >= 3) {
				break;
			}

			x++;

		}
		
		System.out.println(x);

	}
}
