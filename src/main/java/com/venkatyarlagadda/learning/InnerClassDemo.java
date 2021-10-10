package com.venkatyarlagadda.learning;


public class InnerClassDemo {
	public static void main(String[] args){
		Outer o = new Outer();
		o.test();
	}
}

class Outer{
	int outer_x = 100;
	
	void test(){
		Inner inner = new Inner();
		inner.display();
	}
	
	//this is an inner class
	class Inner{
		void display(){
			System.out.println(outer_x);
		}
	}
}