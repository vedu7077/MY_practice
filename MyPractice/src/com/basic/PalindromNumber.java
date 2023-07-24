package com.basic;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter A Number ...");
		int number = sc.nextInt();
		
		
		int originalNumber=number;
		int reverseNumber=0;
		int reminder;
		
		
		
		while(number != 0) {
			reminder = number%10;
			reverseNumber=reverseNumber*10+reminder;
			number/=10;
			
			
		}
		if(originalNumber==reverseNumber) {
			System.out.println("The number Is Palandram Number");
			
		}
		else {
			System.out.println("The number Is not Palindram");
		}
		

	}

}
