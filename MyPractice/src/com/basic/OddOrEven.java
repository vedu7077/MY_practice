package com.basic;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = sc.nextInt();
		
		
		if(number % 2 == 0) {
			
			System.out.println("Number Is Odd:");
		}
		else {
			System.out.println("Number Is Even:");
		}
		
		

	}

}
