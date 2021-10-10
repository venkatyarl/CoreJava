package com.venkatyarlagadda.learning;


public class TestPassOb {
	public static void main(String[] args){
		PassOb a = new PassOb(4,5);
		PassOb b = new PassOb(4,5);
		PassOb c = new PassOb(1,2);

		System.out.println(a.equalTo(b));
		System.out.println(a.equalTo(c));
		System.out.println(c.equalTo(b));
	}
}

class PassOb{
	int a, b;
	
	PassOb(int a, int b){
		this.a = a; 
		this.b = b;
	}
	
	boolean equalTo(PassOb o){
		return (o.a == a) && (o.b == b);
	}
}