package com.venkatyarlagadda.se8.practicetests;

public class DefalutInstanceVariable {

	String string1;
	int int1;
	double double1;
	boolean boolean1;
	java.util.Date date;

	public static void main(String[] args){
		
		DefalutInstanceVariable d = new DefalutInstanceVariable();

		System.out.println(d.string1);
		System.out.println(d.int1);
		System.out.println(d.double1);
		System.out.println(d.boolean1);
		System.out.println(d.date);
	}
}
