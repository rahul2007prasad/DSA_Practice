package com.dsa.rahul.charactercase;

import java.util.Scanner;

public class DataType {
	
	public static void main(String[] args) {
		//System.out.println("1st way" +findCharacterSetCase('p'));
		//System.out.println("2nd way "+findCharacterSetCaseWithLessGreater('p'));
		
		Scanner sc = new Scanner(System.in);
		//System.err.println("enter" );
		
		  dataTypes(sc.nextLine());
		
	}
	
	//2nd way
	public static int dataTypes(String dataType) {
		
		
		if(dataType.contains("Integer"))
			return 4;
		else if(dataType.contains("Long"))
			return 8;
		else if(dataType.contains("Float"))
			return 4;
		else if(dataType.contains("Double"))
			return 8;
		else if(dataType.contains("Character"))
			return 1;
		else
			return 0;
		
	}

}
