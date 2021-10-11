package com.venkatyarlagadda.corejava;

public class CallBy {
	public static void main(String[] args){
		
		int x = 21;
		System.out.println(x);
		callByValue(x);
		System.out.println(x);
		
		CallByRef r = new CallByRef(x);

		System.out.println(r.x);
		callByReference(r);
		System.out.println(r.x);
	}
	
	static void callByValue(int x){
		System.out.println(x);
		x = 24;
		System.out.println(x);
	}
	
	static void callByReference(final CallByRef r){
		System.out.println(r.x);
		r.x *=2;
		System.out.println(r.x);
	}
	
}

class CallByRef{
	int x;
	
	CallByRef(int x){
		this.x = x;
	}
}