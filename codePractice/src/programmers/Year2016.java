package programmers;

public class Year2016 {

	public static void main(String[] args) {
		System.out.println(solution(1,1));
	}

	public static String solution(int a, int b) {

		  int total = 0;
	      String w[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
	      
	      int m[] = {31, 29, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
	      
	      for(int i =0;i<a-1;i++){
	          total += m[i];
	      }
	      
	      total += b-1;
	      String answer = w[total%7];
	      return answer;
	}

}
