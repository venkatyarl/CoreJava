package com.venkatyarlagadda.learning.com.exceptions.throwD;

public class ThrowsDemo {
	static void method() throws IllegalAccessException{
		throw new IllegalAccessException();
	}
	
	public static void main(String[] args){
		try{
			method();
		}catch(IllegalAccessException e){
			System.out.println("Illegal Access Exception: " + e);
		}
	}
}
