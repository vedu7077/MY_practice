package com.arrays;

import java.util.Arrays;

public class AlternateElements {
	
	public static void main(String[] args) {
		
		
	
	int [] number = {10,9,8,7,6,5,4,3,2,1};
	
	
	int alternate[] = new int [number.length];
	
	
	for (int i = 0;i<number.length;i++ ) {
		
		if ( i  % 2==0) {
			alternate[i]= number[i+1];
			
			
			
		}
		else {
			
			alternate[i]= number [ i  -1 ];
			}
	}
	
	
	System.out.println(Arrays.toString(number));
	System.out.println(Arrays.toString(alternate));
	
	}
   
}	 
    	
    	
    	
    	
    	
    	
    	
    
