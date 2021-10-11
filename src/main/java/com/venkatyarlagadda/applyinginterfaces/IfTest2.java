package com.venkatyarlagadda.applyinginterfaces;

public class IfTest2 {

}

// Implement a growable stack
class DynamicStack implements IntStack{

	private int stack[];
	private int pos;
	
	// allocate and initialize stack
	DynamicStack(int size){
		stack = new int[size];
		pos=-1;
	}
	
	@Override
	public void push(int item) {
		// if stack is full, allocate a larger  stack
		if(pos == stack.length-1){
			int tmp[] = new int[stack.length-1 * 2];
			for(int x=0; x<stack.length;x++) tmp[x] = stack[x];
			stack = tmp;
		}
		stack[++pos] = item;
	}

	@Override
	public int pop() {
		if(pos<0){
			System.out.println("Stack underflow.");
			return 0;
		}else{
			return stack[pos--];
		}
	}
	
}