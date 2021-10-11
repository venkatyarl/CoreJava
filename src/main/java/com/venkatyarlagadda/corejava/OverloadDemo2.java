package com.venkatyarlagadda.corejava;

public class OverloadDemo2 {
	public static void main(String[] args){
		Overload2 o = new Overload2();
		o.test(2,4);
		o.test(3.0);
		
		int six = 6;
		o.test(six);
	}
}

class Overload2{
	void test(double x){
		System.out.println(x * x);
	}
	void test(int x, int y){
		System.out.println(x*y);
	}
}