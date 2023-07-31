package com.dsa.rahul.charactercase;

import java.util.Scanner;

public class SwitchCaseArea {

	public static void main(String[] args) {
		//System.out.println("1st way" +findCharacterSetCase('p'));
		//System.out.println("2nd way "+findCharacterSetCaseWithLessGreater('p'));
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		//System.err.println("enter" );
		int cho = sc.nextInt();
		double [] dimension = new double[cho];
		for(int i =0 ; i < cho ; i++) {
			dimension[i] = sc2.nextDouble();
		}
		
		//compareIfElse(sc.nextInt(),sc.nextInt());
		System.out.println(areaSwitchCase(cho,dimension));
		
	}
	public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
		
		return 0.0;
    }
}
