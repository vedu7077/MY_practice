package com.basic;
import java.util.Scanner;

public class KrishnamurtiNumber {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter The Number:");
    	int number = sc.nextInt();
    	
    	int sum = 0 ;
    	int copy=number;
    	
    	
    	while(number>0) {
    		
    		int degit = number%10;
    		int fact = 1;
    		
    		for(int i =1;i<=degit;i++) {
    			fact=fact*i;	
    		}
    		
    		sum = sum+fact;
    		number=number/10;	
    	}
    	
    	System.out.println(number);
    	number=copy;
    	
    	
    	if(number == sum) {
    		System.out.println("THE number Is KrishnaMurti");
    		
    	}
    	else {
    		System.out.println("The  Number is not Krishnamurti");
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }}
