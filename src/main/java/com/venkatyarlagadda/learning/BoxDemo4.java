package com.venkatyarlagadda.learning;


public class BoxDemo4 {
	public static void main(String[] args){
		Box myBox = new Box();
		Box myBox2 = new Box();
		
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		myBox2.width = 3;
		myBox2.height = 6;
		myBox2.depth = 9;
		
		double vol = myBox.getVolume();
		System.out.println("Volume of the box 1: " + vol);
		
		vol = myBox2.getVolume();
		System.out.println("Volume of the box 2: " + vol);
	}
}
