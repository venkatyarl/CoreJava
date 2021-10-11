// A simple demonstration of abstract.

package com.venkatyarlagadda.abstractclass;

public class AbstractDemo {
	public static void main(String[] args){
		A a = new B();
		a.callMe();
		a.callMeToo();
	}
}

abstract class A{
	abstract void callMe();
	
	// concrete method are still allowed in abstract class
	void callMeToo(){
		System.out.println("This is a concrete method");
	}
}

class B extends A{
	final void callMe(){
		System.out.println("B's implementation of callme.");
	}
}