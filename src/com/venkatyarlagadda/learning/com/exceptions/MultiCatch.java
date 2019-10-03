package com.venkatyarlagadda.learning.com.exceptions;

public class MultiCatch {
	public static void main(String[] args){
		int a=0, b=0;
		int vals[] = {1,2,3,4};
		
		try{
			//int result = a/b; 	// generate an Arithmetic Exception
			vals[10] = 19; 		// generate an ArrayIndexOutOfBoundsException
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Exception caught: " + e);
		}
		System.out.println("After Multi catch statement.");
	}
}
