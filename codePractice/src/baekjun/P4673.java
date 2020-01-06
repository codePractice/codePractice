package baekjun;


public class P4673 {

	
	
	public static int solve(int n) {
		
		int x = n;
		
		while(n > 0) {
			x += n % 10;
			n =  n/10;
		}
		
		if(x <= 10000) {
			return x;	
		}else {
			return 0;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {

		boolean solve[] = new boolean[10001];

		for(int i = 1; i <= 10000; i++) {
			
			solve[solve(i)] = true;
			
		}
		
		
		for(int i = 0; i < solve.length; i++) {
			
			if(!solve[i]) {
				System.out.println(i);
			}
			
		}
		
		
	}

}
