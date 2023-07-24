package com.basic;

import java.util.Scanner;

public class SymbolDegitOrNOt {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The char:");
		char ch=sc.next().charAt(0);
		
		
		if(Character.isAlphabetic(ch)){
			System.out.println("The Character Is Alphabate:");
			
		}
		else if(Character.isDigit(ch)) {
			System.out.println("The Character Is Degit");
		}
		else {
			System.out.println("The Character Is Symbol");
		}
		
		

	}

}
