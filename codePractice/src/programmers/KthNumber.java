package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class KthNumber {

	public static void main(String[] args) {
		
		int array[] = {1,5,2,6,3,7,4};
		int commands[][] ={ {2,5,3}, {4,4,1}, {1,7,3} };
		
		int result[] = solve(array, commands);
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] solve(int[] array, int[][] commands) {
	
		int answer[] = new int[commands.length];
		
		
		for(int  i = 0; i < commands.length; i++){
	           
            ArrayList<Integer> list = new ArrayList<Integer>();
            
            int m = commands[i][0] -1; //1
            int j = commands[i][1] -1; //4 
            int k = commands[i][2]- 1; //2
            
            
            if(m != j) {
            
            for(int z = m; z <= j; z++){
                list.add(array[z]);
            }
            
            }else {
            	list.add(array[m]);
            }
            
            Collections.sort(list);
            
            
            answer[i] = list.get(k);
            
            }
		
		return answer;
		
	}
	
}
