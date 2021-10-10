package com.venkatyarlagadda.learning.com.interfaces.extended;

public class IfExtend {
	public static void main(String[] args){
		MyClass c = new MyClass();
		c.method1();
		c.method2();
		c.method3();
	}
}

// one interface can extend another.
interface A {
	void method1();
	void method2();
}

interface B extends A{
	void method3();
}

// This class must implement A and B
class MyClass implements B{
	public void method1(){
		System.out.println("Implemented method 1");
	}

	public void method2(){
		System.out.println("Implemented method 2");
	}

	public void method3(){
		System.out.println("Implemented method 3");
	}
}