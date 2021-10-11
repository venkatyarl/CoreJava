package com.venkatyarlagadda.enums;

public class EnumDemo4 {
	public static void main(String[] args){
		for(Apple4 a : Apple4.values()){
			System.out.println(a + ": " + a.ordinal());
		}
		System.out.println();
		
		Apple4 a = Apple4.GoldenDel, b = Apple4.Cortland, c = Apple4.GoldenDel;
		if(a.compareTo(b)<0){
			System.out.println(a + " comes before "+ b);
		}
		if(a.compareTo(b)>0){
			System.out.println(b + " comes before "+ a);
		}
		if(a.compareTo(c)==0){
			System.out.println(a + " equals "+ c);
		}

		System.out.println();

		if(a.equals(b)) System.out.println("Error!");
		if(a.equals(c)) System.out.println(a + " equals "+ c);
		if(a == c) System.out.println(a + " == " + c);
	}
}

enum Apple4{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}