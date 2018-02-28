package org.vj.hktest;

import java.util.Scanner;

public class FunnyString {
	
	static String funnyString(String s){
        // Complete this function
		StringBuilder sb = new StringBuilder(s);
		String reverseStr = sb.reverse().toString();
		int i=1;
		while(i<s.length()) {
			int a = s.charAt(i)-s.charAt(i-1);
			int b = reverseStr.charAt(i)-reverseStr.charAt(i-1);
			if(Integer.compare(Math.abs(a), Math.abs(b)) != 0){
				return "Not Funny";
			}
			i++;
		}
		
		return "Funny";
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
	

}
