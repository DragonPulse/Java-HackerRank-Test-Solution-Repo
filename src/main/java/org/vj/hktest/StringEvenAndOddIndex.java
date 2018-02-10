package org.vj.hktest;

import java.util.Scanner;

public class StringEvenAndOddIndex {

	public static void printString(String[] inputs){
		for(int j=0;j<inputs.length;j++) {
			for(int i = 0; j<inputs[j].length(); i = i+2)
	        {
	            System.out.print(inputs[i].charAt(j));
	        }
	        System.out.print(" ");

	        for(int i = 1; i<inputs[j].length(); i = i+2){
	            System.out.print(inputs[i].charAt(i));
	        }

	        System.out.println();
		}
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int countOfInput = scanner.nextInt();
        String[] stringArray = new String[countOfInput];
    		scanner.nextLine();
        for(int i=0;i<=countOfInput-1;i++) {
        
        		stringArray[i]=scanner.nextLine();
        }
        //printString(stringArray); 
       
        
    }
}
