package com.basic;

import java.util.Scanner;

public class Basic1{

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
	int number =	sc.nextInt();
		
		
		if(number < 50) {
			System.out.println("Number is Less Than 50");
			
		}
		else if(number == 50) {
			System.out.println("Number Is Equal To 50");	
		}
		else {
			System.out.println("Number Is Greather To 50");
		}
		
	}

}
