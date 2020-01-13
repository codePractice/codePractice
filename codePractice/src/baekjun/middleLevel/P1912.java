package baekjun.middleLevel;

import java.util.*;

public class P1912 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.nextLine();

		String str = sc.nextLine();
		String arr[] = str.split(" ");

		int data[] = new int[n];

		int dp[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			data[i] = Integer.parseInt(arr[i]);
		}

		dp[0] = data[0];

		for (int i = 1; i < n; i++) {

			dp[i] = Math.max(data[i], dp[i-1] +data[i]);

		}

		Arrays.sort(dp);
		
		System.out.println(dp[n-1]);
		

	}

}
