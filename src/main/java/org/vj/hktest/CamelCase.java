package org.vj.hktest;

import java.util.Scanner;

public class CamelCase {

	static final String LOWER_CASE = "LOWERCASE";
	static final String UPPER_CASE = "UPPERCASE";
	
	static int findCount(String s,String casea) {
		int count =1;
		int i=1;
		while(i<s.length()) {
			if(casea==LOWER_CASE) {
				if(Character.isLowerCase(s.charAt(i))) {
					count++;
				}
			}else {
				if(Character.isUpperCase(s.charAt(i))) {
					count++;
				}
			}
			i++;
		}
		
		return count;
	}
	static int camelCase(String s) {
		int count =0;
		String firstElementCase;
		if(Character.isLowerCase(s.charAt(0))) {
			firstElementCase=LOWER_CASE;
			count=findCount(s,UPPER_CASE);
		}else {
			firstElementCase=UPPER_CASE;
			count=findCount(s,LOWER_CASE);
		}
		
		
		
		return count;
		
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input  = scanner.next();
		System.out.println(camelCase(input));
				
	}
}
