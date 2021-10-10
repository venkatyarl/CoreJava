package com.venkatyarlagadda.learning;


public class Continue {
	public static void main(String[] args){
		for(int x=0; x<10; x++){
			System.out.print(x + " ");
			if(x%2==0) continue;
			System.out.println("");
		}
	}
}
