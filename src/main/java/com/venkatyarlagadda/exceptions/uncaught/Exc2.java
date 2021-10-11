package com.venkatyarlagadda.exceptions.uncaught;

public class Exc2 {
	public static void main(String[] args){
		int d,a;
		
		try{
			d =0;
			a = 42/d;
			System.out.println("This statement will never print.");
		}catch(ArithmeticException ae){
			System.out.println("Divisible by zero is not allowed");
		}
		System.out.println("After catch statement");
	}
}
