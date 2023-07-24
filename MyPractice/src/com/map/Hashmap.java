package com.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	
	
	

	// static final String String = null;
	//static final Integer Integer = null;

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
        hm.put("123", "BJP");
        hm.put("456", "CONGRESS");
        hm.put("789", "BJP");
        hm.put("555", "SHIVSENA");
        hm.put("111", "SHIVSENA");
        hm.put("222", "BJP");
        hm.put("223", "BJP");

        hm.put("224", "BJP");

        hm.put("266", "BJP");

        hm.put("277", "BJP");

        
        
        System.out.println(hm);
    
        
        
//        
//        
//        ArrayList<String>al = new ArrayList<>(hm.values());
//        
//        System.out.println(al);
//        
//        for(int i=0;i<al.size();i++) {
//        	int count = Collections.frequency(al, al)
//        }
//        
//        
//        
//        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        HashMap<String, Integer> m1 = new HashMap<>();
        
        
        
     //   hm.values();
   //     m1.put(String, Integer);
   //     m1.get(m1);
   //    m1.getClass();
   //    m1.getOrDefault(String, Integer+1);
       
//        
     for(String value : hm.values()) {
       	m1.put(value, m1.getOrDefault(value, 0)+1);
       }
		
        
       for(Map.Entry<String , Integer> e : m1.entrySet()) {
        	System.out.println(e.getKey()+ " " + e.getValue());
        }
        
       
	}

}
