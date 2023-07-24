package com.basic;
//print number bet 50 to 120
public class SwitchDemo3 {

	public static void main(String[] args) {
		
		
		for(int i = 50;i<=120;i++) {
			
			switch(i) {
			case 50:
				System.out.println("Fifty");
				break;
				
			case 51:
				System.out.println("FiftyOne");
				break;
				
			case 53:
				System.out.println("FiftyThree");
				break;
				
				
			case 120:
				System.out.println("OneTwenty");
				break;
				
				default:
					System.out.println("Invalid Number");
				
			
			
			}
			
			
			
		}

	}

}
