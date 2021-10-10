package com.venkatyarlagadda.learning.testing.threeStacksInOneArray;

import java.util.Random;
import java.util.stream.IntStream;

public class ThreeStacksInOneArray {
	public static void main(String[] args){
		ArrayStack as = new ArrayStack();
		Random r = new Random(10);
		
		IntStream.range(0,101).forEach(System.out::println);
		
		
	}
}

class ArrayStack{
	int[] array = new int[10];
	
	
}