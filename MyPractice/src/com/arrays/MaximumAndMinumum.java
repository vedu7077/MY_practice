package com.arrays;

public class MaximumAndMinumum {

	public static void main(String[] args) {

		int [] number= {1,2,3,4,5,6,7,8,9,10,22};
		
		int max =number[0];
		int min = number[0];
		
		for (int  i = 1;i>number.length;i++) {
			if(number[i] > max) {
				max = number[i];
				System.out.println(max + " The number Is Maximum:");
				
				if(number [i]< min ) {
					min = number[i];
				}
				
				
				
	
			
				
			}
			
			System.out.println(max);
			System.out.println(min);
		}
		
		
	
	}

}
