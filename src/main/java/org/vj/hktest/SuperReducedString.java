package org.vj.hktest;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {

	
	static String reducedString(String input) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<input.length();i++) {
			if(stack.isEmpty()) {
				stack.push(new Character(input.charAt(i)));
			}else {
				if(stack.peek() == input.charAt(i)) {
					stack.pop();
				}else {
					stack.push(input.charAt(i));
				}
			}
			
		}
		
		if(stack.size()==0) {
			return "Empty String";
		}
		Enumeration enu = stack.elements();
		StringBuilder sb = new StringBuilder();
		while (enu.hasMoreElements()) {
			sb.append(enu.nextElement());
		}
		return sb.toString();
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input  = scanner.next();
		System.out.println(reducedString(input));
				
	}
}
