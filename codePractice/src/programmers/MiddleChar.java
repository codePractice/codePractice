package programmers;

public class MiddleChar {

	public static void main(String[] args) {
		System.out.println(solution("qwer"));
	}
	
	 public static String solution(String s) {
	      
	      
	      if(s.length() % 2 == 0) {
	    	  int index = s.length()/2;
	    	  return s.substring(index-1,index+1);
	    	  
	      }else { 
	    	  int index = s.length() / 2 ;
	    	  return s.substring(index, index + 1 );
	      }
	      
	      
	  }

}
