package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {

		//Data Structure 12
		//ArrayList�� ���� �۵������� ������ ���͵� �ڵ��� 
		//ArrayList�� ���� �޼ҵ带 ���� �����غ� 
		
		
		ArrayList numbers = new ArrayList();
		
		//������ �ε����� �߰� 
		numbers.addlast(10);
		numbers.addlast(20);
		numbers.addlast(30);
		numbers.addlast(40);
		
		
		
		
		/*for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}*/
		
		ArrayList.ListIterator li = numbers.listIterator();
		/*System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());*/
		
		while(li.hasNext()) {
			
			int number = (int)(li.next());
			if(number == 30) {
				li.remove();
			}
			
			
		}
	
		System.out.println(numbers);
	}

	
	
	
	 
}
