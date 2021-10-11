package com.venkatyarlagadda.enums;

import java.util.Random;

public class Questions {
	public static void main(String[] args){
		Question q = new Question();
		
		
	}
	
	public static void answer(Answers result){
		switch(result){
		case No: sopl("No"); break;
		case Yes: sopl("Yes"); break;
		case Maybe: sopl("Maybe"); break;
		case Later: sopl("Later"); break;
		case Soon: sopl("Soon"); break;
		case Never: sopl("Never"); break;			
		}
	}
	
	public static void sopl(String string){
		System.out.println(string);
	}
}

class Question{
	Random rand = new Random();
	int prob = (int) (100* rand.nextDouble());
	
	public Answers ask(){
		if(prob < 15) return Answers.Maybe; // 15%
		else if(prob < 30) return Answers.No; // 15%
		else if(prob < 60) return Answers.Yes; // 30%
		else if(prob < 75) return Answers.Later; // 15%
		else if(prob < 98) return Answers.Soon; // 13%
		else return Answers.Never; // 12%
	}
	
}

enum Answers{
	Maybe, No, Yes, Later, Soon, Never
}