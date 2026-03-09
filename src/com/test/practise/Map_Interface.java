package com.test.practise;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {
	
	public static void map_Type() {
		
		Map<Integer, String> M = new HashMap<Integer, String>();
		M.put(1, "Mobile");
		M.put(2, "Headphones");
		M.put(3, "Charger");
		
		int size = M.size();
		System.out.println(size);	
		
		String string = M.get(2);
		System.out.println(string);
		
	}
	
	public static void main(String[] args) {
		map_Type();
		
	}

}
