package org.vj.hktest;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HackerRankString {

	static final String SOURCE_STRING="hackerrank";
	
	static String checkForSource(String input) {
		
		 if(input.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*")){
			 return "Yes";
		 }else {
			 return "No";
		 }
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input  = scanner.next();
		System.out.println(checkForSource(input));
		
				
	}
	
}
