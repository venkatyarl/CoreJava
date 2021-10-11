package com.venkatyarlagadda.applyinginterfaces;

public class IfTest {
	public static void main(String[] args){
		FixedStack stack1 = new FixedStack(5);
		FixedStack stack2 = new FixedStack(8);
		
		// push some members onto the stack
		for(int x=0; x<5; x++) stack1.push(x);
		for(int x=0; x<8; x++) stack2.push(x);
		
		// pop those number off the stack
		System.out.println("Stack in stack1:");
		for(int x=0; x<5; x++) System.out.print(stack1.pop());
		System.out.println();
		for(int x=0; x<8; x++) System.out.print(stack2.pop());
	}
}

class FixedStack implements IntStack{

	private int stack[];
	private int pos;
	
	FixedStack(int size){
		stack = new int[size];
		pos=-1;
	}
	
	@Override
	public void push(int item) {
		if(pos == stack.length-1)
			System.out.println("Stack is full");
		else
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