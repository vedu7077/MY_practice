package com.basic;

import java.util.Scanner;

public class DivisibleBy3OR5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		
		
		if(number % 3 == 0) {
			System.out.println("The number Is divisible By 3:");
		}
		else if(number % 9 == 0) {
			System.out.println("The Number Is Divisible By 9:");
			
		}
		else {
			System.out.println("Number is not Divisible By 3 or 9");
		}

	}

}
