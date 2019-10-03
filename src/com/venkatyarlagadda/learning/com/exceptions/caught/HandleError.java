package com.venkatyarlagadda.learning.com.exceptions.caught;

import java.util.Random;

public class HandleError {
	public static void main(String[] args){
		int a =0,b =0, c=0;
		
		Random r = new Random();
		
		for(int x=0; x<32000; x++){
			try{
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b/c);
			}catch(ArithmeticException ae){
				System.out.println("Exception: " + ae);
				a =0;
			}
			System.out.println("a: " + a);
		}
	}
}
