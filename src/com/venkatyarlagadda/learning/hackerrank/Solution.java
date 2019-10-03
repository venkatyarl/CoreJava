package com.venkatyarlagadda.learning.hackerrank;

import java.io.IOException;

public class Solution {

	public static void main(String[] args) throws IOException{
		int [] a = {8,5,11,4,6};
		int moves =0;
    	int start=0;
    	int end = a.length-1;
    	while(start <end){
    		if(a[start]%2==0){
    			start++;
    			continue;
    		}else{
    			if(a[end]%2==0){
    				int temp = a[end];
    				a[end] = a[start];
    				a[start] = temp;
    				start =0;
    				end = a.length-1;
    				moves++;
    			}else{
    				end--;
    			}
    		}
    	}
    	System.out.println(moves+"");
    }
}