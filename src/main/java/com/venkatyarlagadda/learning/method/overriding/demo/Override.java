package com.venkatyarlagadda.learning.method.overriding.demo;

public class Override {
	public static void main(String[] args){
		A a = new A(4,5);
		a.display();
		
		B b = new B(3,3,6);
		b.display();
		
		a = b;
		a.display();
	}
}

class A{
	int i, j;
	
	A(int i, int j){
		this.i = i;
		this.j = j;
	}
	
	void display(){
		System.out.println("I and j are: " + i + " " + j);
	}
}

class B extends A{
	int k;
	B(int i, int j, int k){
		super(i,j);
		this.k=k;
	}
	
	void display(){
		super.display();
		System.out.println("K is: " + k);
	}
}