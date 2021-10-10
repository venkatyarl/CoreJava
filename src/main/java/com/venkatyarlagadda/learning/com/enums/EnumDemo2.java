package com.venkatyarlagadda.learning.com.enums;

public class EnumDemo2 {
	public static void main(String[] args){
		Apple2 apple2;
		
		System.out.println("Here are all Apple constants:");
		
		// use values()
		Apple2 values[] = Apple2.values();
		for(Apple2 value: values){
			System.out.println(value);
		}
		
		System.out.println();
		
		// use valueOf();
		apple2 = Apple2.GoldenDel;
		System.out.println(Apple2.valueOf("Winesap"));
	}
}

enum Apple2{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
