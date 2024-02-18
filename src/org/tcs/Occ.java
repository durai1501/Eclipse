package org.tcs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Occ {
	public static void main(String[] args) {
		
	 String s="Wel come wel so come";
	 String[] s1 = s.split(" ");
	 String s2="";
	
	 
	 Map<String,Integer> map=new HashMap<>();
	 
	for (int i = 0; i < s1.length; i++) {
		 
		s2=s1[i];
		
		if(map.containsKey(s2)) {
			
			Integer count = map.get(s2);
			
			map.put(s2,++count);
		}
		else {
			map.put(s2, 1);
			

		}}
		System.out.println(map);
		
		
		
}
}

	
	

