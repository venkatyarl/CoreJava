package com.venkatyarlagadda.learning.com.interfaces.defaultmethod;

public class DefaultMethodDemo{
	public static void main(String[] args){
		MyIFImp obj = new MyIFImp();
		
		// Can call getNumber(), because it is explicitly
		// implmented by MyIfImp;
		System.out.println(obj.getNumber());
		
		// Can also call getString(), because of default
		// implementation;
		System.out.println(obj.getString());
	}
}
class MyIFImp implements MyIf{ 
	
	// Only getNumber() defined by MyIf needs to be implemented.
	// getString() can be allowed to default.
	public int getNumber(){
		return 100;
	}
	
	public String getString(){
		return "This is a different string.";
	}
}
