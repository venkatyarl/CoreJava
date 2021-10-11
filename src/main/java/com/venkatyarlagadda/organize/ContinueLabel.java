package com.venkatyarlagadda.organize;


public class ContinueLabel {
	public static void main(String[] args){
		outer: for(int x =0 ; x<10; x++){
			for(int y=0;y<10;y++){
				if(y==x) continue outer;
				System.out.print(x*y + " ");
			}
			System.out.println();
		}
	}
}
