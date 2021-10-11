package com.venkatyarlagadda.organize;

public class OverloadDemo {
	public static void main(String[] args){
		Overload o = new Overload();
		o.test();
		o.test(4);
		o.test(4,5);
		double doubleResult = o.test(4.0);
		System.out.println(doubleResult);
	}
}

class Overload{
	void test(){
		System.out.println("No arguments");
	}
	
	void test(int a ){
		System.out.println("a: " + a);
	}
	
	void test(int a, int b){
		System.out.println("a and b: " + a + " " + b);
	}
	
	double test(double a){
		return a * a;
	}
}