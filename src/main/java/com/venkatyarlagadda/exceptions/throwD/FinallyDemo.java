package com.venkatyarlagadda.exceptions.throwD;

public class FinallyDemo {
	public static void main(String[] args){
		try{
			methodA();
		}catch(Exception e){
			System.out.println("Exception caught: " + e);
		}
		
		methodB();
		methodC();
	}
	
	static void methodA(){
		try{
			System.out.println("Inside method A");
			throw new RuntimeException("demo");
		}catch(RuntimeException e){
			System.out.println("Exception caught: " + e);
			throw e;
		}finally{
			System.out.println("In method A's finally method");
		}
	}
	
	static void methodB() {
		try{
			System.out.println("Inside method b");
			return;
		}finally{
			System.out.println("method b's finally method");
		}
	}
	
	static void methodC(){
		try{
			System.out.println("inside method c");
		}finally{
			System.out.println("Method c's finally method");
		}
	}
}
