package com.basic;

import java.util.Scanner;

public class WhileDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        
       while(number > 0) {
    	   
    	   int degit = number%10;
    	   sum=sum+degit;
    	   number = number / 10;
       }
       
       System.out.println(sum);
       
     
}}