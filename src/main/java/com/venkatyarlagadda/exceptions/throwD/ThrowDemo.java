package com.venkatyarlagadda.exceptions.throwD;

public class ThrowDemo {
	public static void main(String[] args){
		try{
			method();
		}catch(NullPointerException npe){
			System.out.println("Recaught exception: " + npe);
		}
	}
	static void method(){
		try{
			throw new NullPointerException();
		}catch(NullPointerException npe){
			System.out.println("Caught Null pointer exception: " + npe);
			throw npe;
		}
	}
}
