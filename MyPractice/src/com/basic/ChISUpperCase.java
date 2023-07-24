package com.basic;

import java.util.Scanner;

public class ChISUpperCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter The char:");
		char ch= sc.next().charAt(0);
		
		
		if(Character.isUpperCase(ch)) {
			System.out.println("The char is Upeer Case ");
		}
		else {
			System.out.println("The Char is Lower case");
		}
		
		
		

	}

}
