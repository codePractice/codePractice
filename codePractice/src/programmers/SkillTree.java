package programmers;


public class SkillTree {

	public static void main(String[] args) {

		System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));

	}

	public static int solution(String skill, String[] skill_trees) {
		  int answer = 0;
		  	
		  	for(int i = 0; i < skill_trees.length; i++) {
		  		
		  		
		  		String[] skills = skill_trees[i].split("");
		  		boolean flag = true;
	  			int index = 0;

		  		
		  		for (String skillChecker : skills) {
		  			
		  			if(index == skill.indexOf(skillChecker)) {
		  				index++;
		  			}else if(index < skill.indexOf(skillChecker)) {
		  				flag = false;
		  				System.out.println("잘못된 스킬트리임 : " +  skill_trees[i]);
		  				break;
		  			}
				}
		  		
		  		if(flag) {
		  			answer++;
		  		}
		  		
		  	}
	        
	        return answer;
		}
	
		

}
