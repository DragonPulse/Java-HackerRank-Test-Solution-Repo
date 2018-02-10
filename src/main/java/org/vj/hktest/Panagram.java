package org.vj.hktest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

	static String checkForPanagram(String input) {
		Set<Character> alphabets = new HashSet<>();
		
		for(int i=0;i<input.length()-1;i++) {
			if(Character.isAlphabetic(input.charAt(i))) {
				alphabets.add(input.charAt(i));
			}
				
		}
		System.out.println(alphabets.size());
		if(alphabets.size()== 26 ) {
			return "pangram";
		}
		
		return "not pangram";
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input  = scanner.nextLine();
		System.out.println(checkForPanagram(input));
		
				
	}
	
}
