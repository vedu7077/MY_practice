package com.basic;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		
		switch(number % 2) {
		
		case 0:    System.out.println("Number Is Even:");
			break;
			
		case 1 : 
			
		case -1 :  System.out.println("The number Is Odd");
			break;
			
			default:
				System.out.println("Number Is Invalid...");
				
			
			
		
		
		
		}
	
		
	}

}





