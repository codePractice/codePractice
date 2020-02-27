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
        
        
        //���� �����Ǿ���� ���
        int rank = 0;
        
        while(rank != progresses.length) {
        //�Ϸ羿 ������Ѿ���
        //���� �����Ǵ¾ְ� 100�̵ɶ����� 
        while(progresses[rank] < 100) {
        processDay(progresses,speeds);
        for(int i = 0; i < progresses.length; i++) {
        //	System.out.println(i + "���� ��� : " +progresses[i]);
        	
        }
        // System.out.println("----------------------------------------------");
        }
        
        int deployCount = 0;
        //�������� �����ؾ��� 
        //100�� �Ѵ� �ֵ��� ������ ������ 
        //�׸��� �����ؾ��� ���� ī��Ʈ �ø� 
        
        int j = rank;
        for(int i = j; i < progresses.length;i++) {
        	if(progresses[i] >= 100) {
        		// System.out.println("�����ѳ� : " + progresses[i]);
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
	
	//�Ϸ� �����Ű�� �Լ� 
	public static void processDay(int []progress, int[] speeds) {
		for(int i = 0; i < progress.length; i++) {
			progress[i] += speeds[i];
		}
	}

}
