package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayLiat {
	public static void main(String[] args) {
		String [] arr = {"D","B","C","A"};
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println("Covert arr to String" +Arrays.toString(arr));
	
	}

}
