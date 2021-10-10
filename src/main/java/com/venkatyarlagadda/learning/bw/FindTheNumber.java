package com.venkatyarlagadda.learning.bw;

import java.util.Scanner;

public class FindTheNumber {
	public static void main(String[] args){
		
		
		int[] array = {1,2,3,4,5};
		int x = 4;
		System.out.println(findNumber(array,x));
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
		
	}
	
	public static String findNumber(int[] array, int k) {
		final String yes = "YES";
		final String no = "NO";
		
		for(int x : array){
			if(x==k){
				return yes;
			}
		}
		return no;
    }
	
	
}
