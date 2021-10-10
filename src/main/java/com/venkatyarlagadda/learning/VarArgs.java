package com.venkatyarlagadda.learning;


public class VarArgs {
	public static void main(String[] args){
		vaTest(10);
		vaTest(1,2,3);
		vaTest();
	}
	
	//vaTest() now uses a vararg.
	static void vaTest(int... v){
		System.out.println("Number of args: " + v.length);
		
		for(int x: v){
			System.out.println(x);
		}
	}
}
