package com.venkatyarlagadda.se8.practicetests.assessmentTest;

public class FeedingSchedule {

	public static void main(String[] args) {
		boolean keepGoing = true;
		int count = 0;
		int x = 3;

		while (count < 3) {
			System.out.println("Count: " + count);
			count++;
			int y = (1 + 2 * count) % 3;
			System.out.println("Y: " + y);
			switch (y) {
			default:
			case 0:
				x -= 1;
				System.out.println("AX: " + x);
				break;
			case 1:
				x += 5;
				System.out.println("BX: " + x);
				break;
			}
		}
		System.out.println(x);
		System.out.println();

		System.out.println("Count 1: " + (1+2*0));
		System.out.println("Count 2: " + (1+2*1));
		System.out.println("Count 3: " + (1+2*2));
		System.out.println();

		System.out.println("1%3: " + 1%3);
		System.out.println("2%3: " + 3%3);
		System.out.println("3%3: " + 5%3);
	}
}