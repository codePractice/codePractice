package list.arraylist.implementation;

public class ArrayList {

	private int size = 0;
	
	//ArrayList�� ���������� �迭�� ����� 
	private Object[] elementData = new Object[100];
	
	//����Ʈ ���� ó���� �߰��ϴ¹� add()�޼ҵ带 ����Ѵ� 
	public boolean addFirst(Object element) {
		return add(0,element);
	}
	
	
	//����Ʈ ���� ���� �߰��ϴ¹� 
	public boolean addlast(Object element) {
		
		//elementData�� size ��° �ε����� element�� �߰��� 
		elementData[size] = element;
				
		//ũ�Ⱑ 1 �����߱� ������ size++ 
		size++;
		
		return true;
	}
	
	//����Ʈ ���ϴ� �ε����� �߰��ϴ¹� 
	/* elementData[4] = elementData[3] --> size -1
	 * elementData[3] = elementData[2]
	 * elementData[2] = elementData[1] --> �Ű����� index�� ���� 
	 * elementData[1] = 15 
	 */
	public boolean add(int index, Object element) {
		
		for(int i = size -1; i >= index; i--) {
			elementData[i+1] = elementData[i];
		}
		
		elementData[index] = element;
		
		size++;
		
		return true;
	}
	
	
	
	public String toString() {
		
		String str = "";
		
		for(int i = 0; i < size; i++) {
		
			if(i == size - 1) {
			str += elementData[i] ;
			}else {
			str += elementData[i] + ",";
			}
		}
		
			
		return str;
	}

	//index ��° �����͸� ���� 
	// ������ index�� null�� �Ǳ� ������ �迭 ��ü�� ���������־�� �� 
	/* elementData[3] = elementData[4] --> size - 1 
	 * elementData[2] = elementData[3]
	 * elementData[1] = elementData[2] --> index , index + 1 
	 */
	public Object remove(int index) {
		
		//������ �� ���� �� ���� 
		Object removed = elementData[index];
		
		for(int i = index+1; i <= size-1; i++) {
			elementData[i-1] = elementData[i];
		
		}
		
		size--;
		
		elementData[size] = null;
		
		return removed;
		
	}
	
	//���� ó���ε��� ���� 
	public Object removeFirst() {
		return remove(0);
	}
	
	
	//���� ������ �ε��� ���� 
	public Object removceLast() {
		return remove(size-1);
	}
	
	//index��° �� �������� 
	//ArrayList�� get�޼ҵ带 ���� Ư�� �ε����ǰ��� ������ �����ӵ��� ������ �� �ִ� (����) 
	//RAM�� ����Ǿ��ִ� �迭�� �����ؼ� ���� �������� ���� 
	public Object get(int index) {
		
		return elementData[index];
		
	}
	
	//List ũ�⸦ ������ 
	public int size() {
		return size;
	}
	
	
	//Ư������ ���° �ε����� �ִ� ������ 
	public int indexOf(Object o) {
		
		
		
		for(int i = 0; i < size; i++) {
			
			if(o.equals(elementData[i])) {
				return i;
			}
			
		}
		
		//ã�°��� ���� ��� 
		return -1;
	}
	
	
	public ListIterator listIterator() {
		
		
		return new ListIterator();
	}
	
	
	class ListIterator  {
		
		private int nextIndex = 0;
		
		public Object next() {
			
			/*Object returnData = elementData[nextIndex];
			
			nextIndex++;
			
			return returnData;*/
			
			//����������Ʈ�� �����ϰ� nextIndex�� 1�߰��� 
			return elementData[nextIndex++];
			
		}
		
		public boolean hasNext() {
			
			return nextIndex < size();
			
		}
		
		public Object previous() {
			//nextIndex -1 �� ���� ���� ������  
			return elementData[--nextIndex];
		}
		
		public boolean hasPrevious() {
			//0�̸� --�� -1 �̵Ǵ� ���� �����̱⶧���� 0���� Ŭ�� true�� 
			
			return nextIndex > 0 ;
		}
		
		public void add(Object element) {
			ArrayList.this.add(nextIndex++,element);
		}
		
		public void remove() {
			ArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
