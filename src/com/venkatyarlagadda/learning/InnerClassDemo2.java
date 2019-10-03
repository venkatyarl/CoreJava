package com.venkatyarlagadda.learning;


public class InnerClassDemo2 {
	public static void main(String[] args){
		Outer2 o = new Outer2();
		o.test();
	}
}

class Outer2{
	int outer_x = 100;
	
	void test(){
		for(int x=0; x<10; x++){
			class Inner2{
				void display(){
					System.out.println(outer_x);
				}
			}
			
			Inner2 i = new Inner2();
			i.display();
		}
	}
}
