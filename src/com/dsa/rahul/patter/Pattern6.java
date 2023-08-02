package com.dsa.rahul.patter;



public class Pattern6 {

	
	/*
	 
	 12345
	 1234
	 123
	 12
	 1
	  
	 */
	public static void main(String[] args) {
		
		for(int i = 5 ; i >= 1 ;  i--) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		
	}
}


