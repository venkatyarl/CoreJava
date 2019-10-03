package com.venkatyarlagadda.se8.practicetests;

public class TestStringEquality {
	
	public static void main(String[] args){
		//stringTest1();
		stringTest2();
	}
	
	public static void stringTest2(){
		String str1 = "Java";
		String str2 = "Java";
		String str3 = "Jav";
		String str4 = "java";
		str3+="a";
		StringBuilder sb = new StringBuilder();
		sb.append("Ja").append("va");
		

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		System.out.println(sb.toString() == str1);
		System.out.println(sb.toString().equals(str1));
	}
	
	public static void stringTest1(){
		String str1 = "Java";
		String[] str2 = {"J","a","v","a"};
		String str3 = str1;
		String str4="";
		
		for(String s: str2){
			str4 += s;
		}

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println((str1 == str3) + " " + str1.equals(str3) + " ");
		System.out.println((str1 == str4) + " " + str1.equals(str4));
	}
}