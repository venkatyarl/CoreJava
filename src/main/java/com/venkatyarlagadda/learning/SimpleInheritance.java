package com.venkatyarlagadda.learning;

public class SimpleInheritance {
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		
		// The superclass may be used by itself
		a.i = 10;
		a.j = 20;
		System.out.println("Constens of a: ");
		a.showij();
		System.out.println();
		
		// The subclass has access to all public members of its super class
		b.i=10;
		b.j=20;
		b.k=30;
		System.out.println("Contents of b: " );
		b.showij();
		b.showk();
		
		System.out.println("Sum of i,j, and k: " + (b.i + b.j + b.k));
	}
}

class A{
	int i,j;
	
	void showij(){
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A{
	int k;
	
	void showk(){
		System.out.println("k: " + k);
	}
}