package org.vj.hktest;

import java.util.Scanner;

public class CeaserProblem {

	private static String encode(String line) {
	    char[] toEncode = line.toCharArray();
	    for (int i = 0; i < toEncode.length; i++) {
	        if (Character.isLetter(toEncode[i])) {
	            toEncode[i] += 2;
	        }
	    }
	    line = String.valueOf(toEncode);
	    return line;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input  = scanner.next();
		System.out.println(encode(input));
		System.out.println((char)('z'+ (char)2));
				
	}
}
