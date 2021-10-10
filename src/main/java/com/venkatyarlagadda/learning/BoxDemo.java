package com.venkatyarlagadda.learning;

public class BoxDemo {
	public static void main(String[] args){
		Box myBox = new Box();
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		double vol = myBox.width * myBox.height * myBox.depth;
		System.out.println("Volume of the box : " + vol);
	}
}

