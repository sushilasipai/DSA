package stack;

public class Stack {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.pop();

	}
	private int[] object;
	private int stackSize;
	private int top;
	
	private Stack() {
		stackSize = 1;
		top = -1;
		object = new int[stackSize];
	}
	
	private void push(int item) {
		if(top >= stackSize - 1) {
			resize();
		}
		object[++top] = item;
	}
	
	private void resize() {
		int[] temp = object;
		stackSize = stackSize * 2;
		object = new int[stackSize];
		
		for (int i =0; i<=top; i++ ) {
			object[i] = temp[i];
		}
	}
	
	private Integer pop() {
		if(top <= -1) {
			return null;
		}
		return object[top--];
	}

}

