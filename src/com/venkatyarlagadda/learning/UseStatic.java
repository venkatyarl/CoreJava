package com.venkatyarlagadda.learning;


class UseStatic {
	
	static void method(int x){
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static int a =3;
	
	static {
		System.out.println("2nd Static block initalized");
		b = a*4;
	}

	static int b;
	
	static{
		System.out.println("Static block initialized");
	}
	
	
	public static void main(String[] args){
		method(42);
	}
}
