package com.venkatyarlagadda.organize;


public class RecursionTest2 {
	public static void main(String[] args){
		Recursion2 r = new Recursion2();
		r.printVaulesDesc(r.values.length-1);
	}
}

class Recursion2{
	int[] values = new int[100];
	
	Recursion2(){
		for(int x =0; x< values.length; x++){
			values[x] = x;
		}
	}
	
	void printValues(int i){
		if(i<0) return;
		printValues(i-1);
		System.out.println("values[" + i + "]: " + values[i]);
	}
	
	void printVaulesDesc(int i){
		if(i<0) return;
		System.out.println("values[" + i + "]: " + values[i]);
		printVaulesDesc(i-1);
	}
}