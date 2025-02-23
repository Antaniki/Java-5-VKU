package ex8_1;

public class MyIntStack {
	private int[] contents;
	private int tos;		//Top of the stack
	public MyIntStack(int capacity) {
		contents = new int[capacity];
		tos = -1;
	}
	public boolean push(int element) {
		try {
			tos+=1;
			contents[tos] = element;
		} catch (IllegalStateException e) {
			System.err.println(e);
			if(e != null) {
				return false;
			}
		} 
		return true;
		
	}
	
	
	public int pop() {
		return contents[tos--];
	}
	
	public int peek() {
		return contents[tos];
	}
	public boolean isEmpty() {
		if(tos < 0) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
	      return tos == contents.length - 1;
	}
	
	
}
