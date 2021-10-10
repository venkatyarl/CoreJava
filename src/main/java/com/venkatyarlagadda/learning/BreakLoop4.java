package com.venkatyarlagadda.learning;


public class BreakLoop4 {
	public static void main(String[] args){
		outer: for(int x=0; x<10; x++){
			System.out.print("Pass "+ x + " :");
			for(int y=0;y<100; y++){
				if(y==10) break outer;
				System.out.print(y + " ");
			}
		}
	System.out.println("Loop is Complete.");
	}
}
