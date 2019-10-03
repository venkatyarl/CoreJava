package com.venkatyarlagadda.learning.com.other;

public class MyPalindromeTest {
	public static void main(String[] args){
		 for(int x=0; x<1000; x++){
			 if(x == reverse(x)){
				 System.out.println("x: " + x + " reverse: " + reverse(x));
			 }
		 }
	}
	
	public static int reverse(int x){
		int retvalue = 0;
		while(x!=0){
			retvalue = retvalue * 10 + x % 10;
			x = x/10;
		}
		return retvalue;
		
	}
}