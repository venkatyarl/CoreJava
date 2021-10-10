package com.venkatyarlagadda.learning;


public class NoBodyInWhileLoop {
	public static void main(String[] args){
		int a = 100;
		int b = 200;
		
		while(++a != --b);
		
		System.out.println("a and b meet first at " + a + " " + b);
	}
}
