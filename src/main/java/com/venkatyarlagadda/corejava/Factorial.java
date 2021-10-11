package com.venkatyarlagadda.corejava;


public class Factorial {
	public static void main(String[] args){
		System.out.println(findFactorial(3));
		System.out.println(findFactorial(4));
		System.out.println(findFactorial(5));
	}
	
	static int findFactorial(int number){
		if(number > 1){
			return number * findFactorial(number-1);
		}else{
			return number;
		}
	}
}
