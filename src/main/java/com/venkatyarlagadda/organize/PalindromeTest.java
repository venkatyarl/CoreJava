package com.venkatyarlagadda.organize;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// int number = scanner.nextInt();
		int[] numbers = { 1, 20, 22, 102, 101, 1221, 13321, 13331, 0, 11 };

		for (int number : numbers) {
			System.out.println("Does number : " + number + " is a palindrome? " + isPalindrome(number));
			System.out.println("------------------------------------------");
			System.out.println();
			System.out.println();
		}
	}

	private static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

	private static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			System.out.println("Number: " + number);
			System.out.println("reverse * 10: " + reverse*10);
			System.out.println("reverse % 10: " + reverse*10);
			reverse = reverse * 10 + number % 10;
			System.out.println("reverse: "+reverse);
			System.out.println("number / 10: " + number/10);
			number = number / 10;
			System.out.println("End Number: " + number);
			System.out.println();
		}

		return reverse;
	}

}