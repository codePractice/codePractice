package baekjun;

import java.util.Scanner;

public class P2908 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String arr[] = str.split(" ");
		int n1 = Integer.valueOf(arr[0]);
		int n2 = Integer.valueOf(arr[1]);
		
		
		int one = n1 % 10;
		int ten = n1 / 10 % 10 ; 
		int hundred = n1 / 10 /10 ; 
		
		
		int new1 = one * 100 + ten * 10 + hundred;
		
		int one2 = n2 % 10;
		int ten2 = n2 / 10 % 10 ; 
		int hundred2 = n2 / 10 /10 ; 
		
		int new2 = one2 * 100 + ten2 * 10 + hundred2;
		
		if(new1 > new2) {
			System.out.println(new1);
		}else if(new1 < new2) {
			System.out.println(new2);
		}
	}

}
