package com.venkatyarlagadda.learning.com.exceptions.chains;

public class ChainExcDemo {
	static void method(){
		// Create an exception
		NullPointerException npe = new NullPointerException("Top Layer");
		
		// add a cause
		npe.initCause(new ArithmeticException("Cause"));
		
		throw npe;
	}
	
	public static void main(String[] args){
		try{
			method();
		}catch(NullPointerException e){
			// Display top level exception
			System.out.println("Caught: " + e);
			
			// Display cause exception
			System.out.println("Original Cause: " + e.getCause());
		}
	}
}
