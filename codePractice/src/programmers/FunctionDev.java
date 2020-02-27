package programmers;

import java.util.ArrayList;

public class FunctionDev {

	public static void main(String[] args) {
		
		int print[] = solution(new int[] {93, 30, 55, 60, 40, 65}, new int[] {1, 30, 5, 10, 60, 7});
		
		for(int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
	}
	
	
	public static int[] solution(int[] progresses, int[] speeds) {
        
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        
        //현재 배포되어야할 기능
        int rank = 0;
        
        while(rank != progresses.length) {
        //하루씩 진행시켜야함
        //현재 배포되는애가 100이될때까지 
        while(progresses[rank] < 100) {
        processDay(progresses,speeds);
        for(int i = 0; i < progresses.length; i++) {
        //	System.out.println(i + "번쨰 기능 : " +progresses[i]);
        	
        }
        // System.out.println("----------------------------------------------");
        }
        
        int deployCount = 0;
        //끝났으면 배포해야지 
        //100이 넘는 애들은 모조리 배포함 
        //그리고 배포해야할 순위 카운트 올림 
        
        int j = rank;
        for(int i = j; i < progresses.length;i++) {
        	if(progresses[i] >= 100) {
        		// System.out.println("배포한놈 : " + progresses[i]);
        		rank++;
        		deployCount++;
        	}else {
        		break;
        	}
        }
        
        answerList.add(deployCount);
        }
        int answer[] = new int[answerList.size()];
      
        for(int i = 0; i < answerList.size(); i++) {
        	answer[i] = answerList.get(i);
        }
        
        return answer;
    }
	
	//하루 진행시키는 함수 
	public static void processDay(int []progress, int[] speeds) {
		for(int i = 0; i < progress.length; i++) {
			progress[i] += speeds[i];
		}
	}

}
