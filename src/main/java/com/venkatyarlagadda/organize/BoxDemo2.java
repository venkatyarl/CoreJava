package com.venkatyarlagadda.organize;

public class BoxDemo2 {
	public static void main(String[] args){
		Box myBox = new Box();
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		Box myBox2 = new Box();
		myBox2.width = 3;
		myBox2.height = 6;
		myBox2.depth = 9;
		
		double vol = myBox.width * myBox.height * myBox.depth;
		System.out.println("Volume of the box 1: " + vol);
		
		vol = myBox2.width * myBox2.height * myBox2.depth;
		System.out.println("Volume of the box 2: " + vol);
	}
}
