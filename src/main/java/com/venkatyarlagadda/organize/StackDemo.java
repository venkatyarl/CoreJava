package com.venkatyarlagadda.organize;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		for (int x = 0; x < 10; x++) {
			stack.push(x);
		}
		for(int x=0; x<10;x++){
			System.out.println(stack.pop());
		}
	}
}

class Stack {
	private int stack[] = new int[10];
	private int pos;

	// Initialize top of the stack
	public Stack() {
		pos = -1;
	}

	// push an item on to the stack
	void push(int item) {
		if (pos == stack.length-1) {
			System.out.println("Stack is full");
		} else {
			stack[++pos] = item;
		}
	}

	// pop an item from the stack
	int pop() {
		if (pos == 0) {
			System.out.println("The stack is empty");
			return 0;
		} else {
			return stack[pos--];
		}
	}
}