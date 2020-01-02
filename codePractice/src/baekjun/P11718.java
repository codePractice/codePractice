package baekjun;

import java.util.ArrayList;
import java.util.Scanner;

public class P11718 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			list.add(str);
			
		}
		
		sc.close();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
