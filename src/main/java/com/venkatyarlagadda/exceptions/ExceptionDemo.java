package com.venkatyarlagadda.exceptions;

public class ExceptionDemo {
	public static void main(String[] args){
		try{
			compute(1);
			compute(20);
		}catch(MyException e){
			System.out.println("Caught: " + e);
		}
	}
	
	static void compute(int x) throws MyException{
		System.out.println("Called Compute (" + x + ")");
		if(x>10) throw new MyException(x);
		System.out.println("Normal Exit.");
	}
}

class MyException extends Exception{
	private int detail;
	
	MyException(int message){
		detail = message;
	}
	public String toString(){
		return "MyException [" + detail + "]";
	}
}
