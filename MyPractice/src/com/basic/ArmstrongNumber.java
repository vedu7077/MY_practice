package com.basic;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = sc.nextInt();
		
		
		int sum=0;
		int copy =number;
		
		while(number>0) {
			
			int degit=number%10;
			sum = sum +(degit*degit*degit);
			number = number/10;
			
			
		}
		
		System.out.println(sum);
		number=copy;
		
		
		if(sum == number ) {
			System.out.println("This A Aramstrong Number ");
			
		}
		else {
			System.out.println("The number Is not Armstrong");
		}
		
		
	}
	

}
