package com.venkatyarlagadda.learning;

class Light{
	public static void main(String[] args){
		int lightSpeed;
		long days;
		long seconds;
		long distance;

		// Approximate speed of light in miles per second
		lightSpeed = 186000;

		days = 1000; // specify number of days here
		seconds = days * 24 * 60 * 60; // Convert to seconds
		distance = lightSpeed * seconds; // compute distance

		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
	}
}
