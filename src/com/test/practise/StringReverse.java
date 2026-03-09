package com.test.practise;

public class StringReverse {
	
	void string_reverse() {
		
		String s = "Java Concepts";
		
		String reversed = new StringBuilder(s).reverse().toString();
		
		System.out.println("S : " + s);
		System.out.println("Reversed : " + reversed);
			
		}
	
	public static void main(String[] args) {
		StringReverse Sr = new StringReverse();
		Sr.string_reverse();
	}
}


