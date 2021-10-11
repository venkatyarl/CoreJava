package com.venkatyarlagadda.corejava;

public class VarArgs2 {
	public static void main(String[] args){
		vaTest("One vararg:", 10);
		vaTest("Three varargs: ", 1,2,3);
		vaTest("No varargs: ");
	}
	
	//Here, msg is a normal parameter and v is a varargs parameter
	static void vaTest(String msg, int...v){
		 System.out.println(msg + v.length + " Contents: ");
		 
		 for(int x: v){
			 System.out.println(x);
		 }
	}
}
