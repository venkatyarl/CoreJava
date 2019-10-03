package com.venkatyarlagadda.learning.com.enums;

public class EnumDemo3 {
	public static void main(String[] args){
		for(Apple3 a : Apple3.values()){
			System.out.println("The price of " + a.toString() + " is " + a.getPrice() + ".");
		}
	}
}

enum Apple3{
	Jonathan(10), GoldenDel(11), RedDel(12), Winesap(13), Cortland(14);
	
	private int price;
	
	Apple3(int price){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
}
