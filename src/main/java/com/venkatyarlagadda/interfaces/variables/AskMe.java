package com.venkatyarlagadda.interfaces.variables;

import java.util.Random;

public class AskMe implements SharedConstants {
	static void answer(int result){
		switch(result) {
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("Yes");
			break;
		case LATER:
			System.out.println("Later");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case NEVER:
			System.out.println("Never");
		}
	}
	public static void main(String [] args){
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}

class Question implements SharedConstants {
	Random rand = new Random();
	
	int ask(){
		int prob = (int) (100 * rand.nextDouble());
		if(prob < 30)
			return NO;		// 30%
		else if(prob < 60)
			return YES;		// 30%
		else if(prob < 75)
			return LATER;	// 15%
		else if(prob < 98)
			return SOON;	// 13%
		else
			return NEVER;	// 02%
	}
}