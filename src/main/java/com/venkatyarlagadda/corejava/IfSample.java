package com.venkatyarlagadda.corejava;

class IfSample{
	public static void main(String[] args){
		int x, y;
		x=10;
		y=20;

		if(x<y) System.out.println("x is less than y");
		x=x*2;
		if(x == y) System.out.println("x is not equal to y");
		x = x*2;
		if(x>y)System.out.println("x is now greater than y");

		// this wont display anything
		if(x==y) System.out.println("you won't see this");
	}
}