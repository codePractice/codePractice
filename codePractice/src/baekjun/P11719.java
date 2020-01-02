package baekjun;

import java.util.ArrayList;
import java.util.Scanner;

public class P11719 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		
		while(sc.hasNext()) {
			
			String str = sc.nextLine();
			list.add(str);
			
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
