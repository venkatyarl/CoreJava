package com.venkatyarlagadda.learning.hackerrank;

public class SingletonTest {

}

class Singleton{
	private static Singleton s;
	public String str;
	
	private Singleton(){
		
	}
	
	public static Singleton getSingleInstance(){
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
	
	public String getStr(){
		return str;
	}
	
	public void setStr(String x){
		str = x;
	}
}