package com.venkatyarlagadda.learning.bw;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

public class Class1 {

		public static void main(String[] args) {
			try{
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=2;
			int n2=1;
			int n3=3;
			int n4=4;
			int n5=5;
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods=Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

class Prime{
	public void checkPrime(int... numbers){
		for(int x: numbers){
            if(isPrime(x)){
                System.out.print(x + " ");
            }
          }
	   System.out.println();
	}
    
    public boolean isPrime(int num){
    	if(num == 1) return false;
    	for(int x =2; x<num; x++){
    		if (num%x ==0){
    			return false;
    		}
    	}
    	return true;
    }
}