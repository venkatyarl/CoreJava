package com.venkatyarlagadda.learning.bw;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
	
	public static void main(String[] args){
		int[] array = oddNumber(3,9);
		for(int x = 0; x<array.length; x++){
			System.out.println(array[x]);
		}
	}
	
	public static int[] oddNumber(int l, int r){
        List<Integer> integerList = new ArrayList<Integer>();
		
		int index =0;
        int x = l;
        while(x<=r){
            if(x%2!=0){
            	integerList.add(x);
            }
            x++;
        }
        int[] result = new int[integerList.size()];
        Integer[] temp = integerList.toArray(new Integer[integerList.size()]);
        
        for (int n = 0; n < integerList.size(); ++n) {
            result[n] = temp[n];
        }

        return result;
	}

}
