package com.venkatyarlagadda.se8.practicetests;

public class Chick {
	
	private String name = "Fluffy";
	
	{System.out.println("Setting field"); }
	
	public Chick(){
		name = "Tiny";
		System.out.println("Setting Constructor");
	}
	
	public static void main(String...strings){
		Chick chick = new Chick();
		System.out.println(chick.name);
	}

}
