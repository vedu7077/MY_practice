package com.basic;

import java.util.Scanner;

public class WhileDemo2 {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		int reverse=0;
		
		
		while(reverse> 0) {
			
			
			int degit = number % 10;
			reverse = reverse * 10 +degit;
			number = number/10;
			
		}
		
		System.out.println(reverse);
		
	}

}
