package list.arraylist.implementation;

public class ArrayList {

	private int size = 0;
	
	//ArrayList는 내부적으로 배열을 사용함 
	private Object[] elementData = new Object[100];
	
	//리스트 제일 처음에 추가하는법 add()메소드를 사용한다 
	public boolean addFirst(Object element) {
		return add(0,element);
	}
	
	
	//리스트 제일 끝에 추가하는법 
	public boolean addlast(Object element) {
		
		//elementData의 size 번째 인덱스에 element가 추가됨 
		elementData[size] = element;
				
		//크기가 1 증가했기 때문에 size++ 
		size++;
		
		return true;
	}
	
	//리스트 원하는 인덱스에 추가하는법 
	/* elementData[4] = elementData[3] --> size -1
	 * elementData[3] = elementData[2]
	 * elementData[2] = elementData[1] --> 매개변수 index와 같음 
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

	//index 번째 데이터를 삭제 
	// 삭제된 index는 null이 되기 때문에 배열 전체를 재조정해주어야 함 
	/* elementData[3] = elementData[4] --> size - 1 
	 * elementData[2] = elementData[3]
	 * elementData[1] = elementData[2] --> index , index + 1 
	 */
	public Object remove(int index) {
		
		//삭제될 값 저장 후 리턴 
		Object removed = elementData[index];
		
		for(int i = index+1; i <= size-1; i++) {
			elementData[i-1] = elementData[i];
		
		}
		
		size--;
		
		elementData[size] = null;
		
		return removed;
		
	}
	
	//제일 처음인덱스 삭제 
	public Object removeFirst() {
		return remove(0);
	}
	
	
	//제일 마지막 인덱스 삭제 
	public Object removceLast() {
		return remove(size-1);
	}
	
	//index번째 값 가져오기 
	//ArrayList는 get메소드를 통해 특정 인덱스의값을 굉장히 빠른속도로 가져올 수 있다 (장점) 
	//RAM에 저장되어있는 배열로 접근해서 값을 가져오기 때문 
	public Object get(int index) {
		
		return elementData[index];
		
	}
	
	//List 크기를 리턴함 
	public int size() {
		return size;
	}
	
	
	//특정값이 몇번째 인덱스에 있는 리턴함 
	public int indexOf(Object o) {
		
		
		
		for(int i = 0; i < size; i++) {
			
			if(o.equals(elementData[i])) {
				return i;
			}
			
		}
		
		//찾는값이 없을 경우 
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
			
			//다음엘리먼트를 리턴하고 nextIndex를 1추가함 
			return elementData[nextIndex++];
			
		}
		
		public boolean hasNext() {
			
			return nextIndex < size();
			
		}
		
		public Object previous() {
			//nextIndex -1 한 값의 값을 리턴함  
			return elementData[--nextIndex];
		}
		
		public boolean hasPrevious() {
			//0이면 --로 -1 이되는 순간 예외이기때문에 0보다 클때 true임 
			
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
