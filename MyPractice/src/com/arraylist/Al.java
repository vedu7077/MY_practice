package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Al {

	public static void main(String[] args) {

//		 add ELement 
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Vedant");
//		al.add("Adwait");
//		al.add("Parth");
//		al.add("Toshavi");
//		System.out.println(al);
//		al.add("Sanchu");
//		System.out.println(al);
		
		
		
		
		
		
//		
//		al.add(3, null);
//		System.out.println(al);
//		
//		ArrayList newList = new ArrayList();
//		newList.add(2);
//		al.addAll(newList);
//		System.out.println(newList);
//		
//		System.out.println(al.get(2));
		
		
		
		
		
		
	// remove method in ArrayList 
//		
//		ArrayList<Integer> al = new ArrayList<>();
//		
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		al.add(50);
//		al.add(60);
//		al.add(70);
//		al.add(80);
//		al.add(90);
//		al.add(100);
//		
//		System.out.println(al);
		
//		
//		al.remove(1);
//		System.out.println(al);
//		
//		
//		al.remove(Integer.valueOf(70));
//		System.out.println(al);
//		
////		al.clear();
////		System.out.println(al);
//		
//		al.set(2, 500);
//		System.out.println(al);
//		
//		
//		// Iterate method 
//		
		
		
//		
//		for(int i=0;i<al.size();i++) {
//			
//			System.out.println("The element is "+ al.get(i));
//		}
//		
//		for( Integer element : al) {
//			System.out.println("For Each element is "+ element);
//
//			
//		}
//		
//		
//		Iterator<Integer> it = al.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println("Iterator" + it.next());
//		}
//		
//		
	//                      	stack
		
//		
//		Stack<String> animal = new Stack<>();
//		
//		animal.push("Lion");
//		animal.push("Dog");
//		animal.push("Horse");
//		animal.push("Cat");
//
//		System.out.println(animal);
//		System.out.println(animal.peek());
		
		
		
		// Queue 
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(12);
		q.offer(24);
		q.offer(36);
		
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.remove(q));

	
	}

}
