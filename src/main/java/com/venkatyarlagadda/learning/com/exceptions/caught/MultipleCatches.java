package com.venkatyarlagadda.learning.com.exceptions.caught;

public class MultipleCatches {
	public static void main(String[] args){
		try{
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42/a;
			int c[] = {1};
			c[42] = 99;
		}catch(ArithmeticException ae){
			System.out.println("Divisible by zero is not permitted: " + ae);
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Array index oob: " + aiobe);
		}
		System.out.println("After the catch statement.");
	}
}
