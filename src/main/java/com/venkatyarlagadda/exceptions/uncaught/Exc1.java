package com.venkatyarlagadda.exceptions.uncaught;

public class Exc1 {
	public static void main(String[] args){
		Exc1.subroutine();
	}
	
	static void subroutine(){
		int d =0;
		int a = 42/d;
	}
}
