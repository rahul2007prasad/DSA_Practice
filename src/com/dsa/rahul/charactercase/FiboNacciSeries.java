package com.dsa.rahul.charactercase;

import java.util.Scanner;

public class FiboNacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cho = sc.nextInt();
		
		System.out.println(fiBoNacci(cho) + " ");
		
	}
	public static int fiBoNacci(int ch) {
	
		if(ch == 1)
			return 1;
		else if(ch ==2)
			return 1;
		return fiBoNacci(ch-1) + fiBoNacci(ch-2);
    }
}
