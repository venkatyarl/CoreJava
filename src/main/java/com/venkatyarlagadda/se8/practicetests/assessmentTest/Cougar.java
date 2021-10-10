package com.venkatyarlagadda.se8.practicetests.assessmentTest;

abstract class Puma implements HasTail {
	/*
	protected int getTailLength() {
		return 4;
	}
	*/

}

interface HasTail {
	int getTailLength();
}

public class Cougar extends Puma {
	
	public static void main(String[] args) {
		//Puma puma = new Puma();
	}

	@Override
	public int getTailLength() {
		return 2;
	}

}