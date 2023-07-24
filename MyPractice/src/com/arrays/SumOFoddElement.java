package com.arrays;

public class SumOFoddElement {

	public static void main(String[] args) {
		
		
		int[] number = {2,5,6,4,7,8,9,6,5,2};
		
		int sum = 0 ;
	for (int num : number ) {
		
		if(num % 2 == 0) {
			
			
			sum += num;
			System.out.println(num);
		}
	}
	System.out.println(sum+ "Sum Of Odd Number ");

	

	}

}






  








