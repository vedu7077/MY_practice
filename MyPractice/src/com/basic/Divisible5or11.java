package com.basic;

import java.util.Scanner;

public class Divisible5or11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number");
		int number = sc.nextInt();
		
		
		if(number % 5 ==0) {
			System.out.println("The number is Divisible By 5");
			
		}
		
		else if(number % 11== 0) {
			System.out.println("The number Is Divisible By 11");
			
		}
		
		else {
			
			System.out.println("The number is not Divisible BY 5 or 11");
			
			
		}

	}

}
