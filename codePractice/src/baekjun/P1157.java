package baekjun;

import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {
		
		 //알파벳 대문자는 65에서 90임 A-Z
		 
		Scanner sc = new Scanner(System.in);
		
		int count[] = new int[91];
		
		String str = sc.next().toUpperCase();
		
		if(str.length() == 1) {
			System.out.println(str.charAt(0));
			return;
		}
		
		for(int i = 0; i < str.length(); i++) {
			count[(int)(str.charAt(i))]++;
		}
		
		int max = -1;
		int chord = 0;
		char ans = ' ';
		
		for(int i = 65; i <= 90; i++) {
			
			if(max < count[i]){
				max = count[i];
				chord = i;
				ans = ' ';
			}else if(max == count[i]){
				ans = '?';
			}
			
			
		}
		
		if(ans == ' '){
		System.out.println(Character.toChars(chord));
		}else {
			System.out.println('?');
		}
		
		
	}

}
