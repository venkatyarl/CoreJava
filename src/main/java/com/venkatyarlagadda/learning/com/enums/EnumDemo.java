package com.venkatyarlagadda.learning.com.enums;

public class EnumDemo {
	public static void main(String[] args){
		Apple a = Apple.RedDel;
		
		// Output an enum value
		System.out.println("Value of a: " + a);
		System.out.println();
		
		a = Apple.GoldenDel;
		
		// Compare two enum values
		if(a == Apple.GoldenDel){
			System.out.println("a contains GoldenDel.\n");
		}
		
		// Use an enum to control a switch statement
		switch(a){
		case Jonathan:
			System.out.println("Johnathan is red");
			break;
		case GoldenDel:
			System.out.println("Golden Delicious is yellow.");
			break;
		case RedDel:
			System.out.println("Red Delicious is red.");
			break;
		case Winesap:
			System.out.println("Winesap is red.");
			break;
		case Cortland:
			System.out.println("Cortland is red.");
			break;
		}
	}
}

enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}