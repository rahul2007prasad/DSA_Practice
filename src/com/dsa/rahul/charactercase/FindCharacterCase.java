package com.dsa.rahul.charactercase;

import java.util.Scanner;

public class FindCharacterCase {
	
	public static void main(String[] args) {
		//System.out.println("1st way" +findCharacterSetCase('p'));
		//System.out.println("2nd way "+findCharacterSetCaseWithLessGreater('p'));
		
		Scanner sc = new Scanner(System.in);
		System.err.println("enter" );
		 char charAt = sc.next().charAt(0);
		 //findCharacterSetCaseWithLessGreater(charAt);
		 System.out.println( findCharacterSetCaseWithLessGreater(charAt));
		
	}
	// one way compl : O(1)
	public static int findCharacterSetCase(Character ch) {
		if(ch.isUpperCase(ch)) 
			return 1;
		else if(ch.isLowerCase(ch))
			return 0;
		else
			return -1;
	
	}
	
	//2nd way
	public static int findCharacterSetCaseWithLessGreater(Character ch) {
		System.out.println("hello");
		if( ch >=65  && ch<= 90 )
			return 1;
		else if( ch >=97  && ch<= 122 )
			return 0;
		else 
			return -1;
	}

}
