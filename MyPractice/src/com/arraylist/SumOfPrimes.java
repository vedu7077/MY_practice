package com.arraylist;

public class SumOfPrimes{
public static void main(String [ ] args){
   int count = 0;
   int number = 2;
   int sum= 0;

  while( count<1000){
if(isPrime(number)){
sum += number;
count++;
}
number++;
}
System.out.println("Sum Of First 1000 Prime Number:"+ sum);
}
public static boolean isPrime(int num){
if(num<=1){
return false;
}
for(int i = 2;i<=Math.sqrt(num);i++){
if(num%i==0){
return false;
}
}
return true;
}
}