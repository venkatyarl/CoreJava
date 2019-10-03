package com.venkatyarlagadda.se8.practicetests;

public class TestMainMethod {
	public static void main(String[] args){
		System.out.println("Using String args");
		for(String s: args){
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void main(int[] args){
		System.out.println("Using int args");
		for(int i: args){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(double[] args){
		System.out.println("Using double args");
		for(double d: args){
			System.out.print(d + " ");
		}
		System.out.println();
	}
}