package baekjun.middleLevel;

import java.util.Arrays;
import java.util.Scanner;

public class P2437 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int array[] = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);

		int min = 1;

		for (int i = 0; i < N; i++) {
			if (min >= array[i]) {
				min += array[i];
			} else {
				break;

			}

		}

		System.out.println(min);

	}

}
