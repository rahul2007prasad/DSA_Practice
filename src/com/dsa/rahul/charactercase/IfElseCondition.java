package com.dsa.rahul.charactercase;

import java.util.Scanner;

public class IfElseCondition {
	
	public static void main(String[] args) {
		//System.out.println("1st way" +findCharacterSetCase('p'));
		//System.out.println("2nd way "+findCharacterSetCaseWithLessGreater('p'));
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		//System.err.println("enter" );
		
		//compareIfElse(sc.nextInt(),sc.nextInt());
		System.out.println(compareIfElse(sc.nextInt(),sc.nextInt()));
		
	}
	
	//2nd way
	public static String compareIfElse(int a , int b) {
		
		
		if(a > b )
			return "greater";
		else if(a < b)
			return "smaller";
		else 
			return "equal";
		
		
	}

}
