package org.vj.hktest;

import java.util.Scanner;

public class GradingStudents {

	public static void gradeUpgrade(int[] data) {
		for(int i=0;i<data.length;i++) {
			if(data[i]>=40) {
				if(5 - (data[i]%5) <3) {
					int s = data[i] +(5 - (data[i]%5));
					System.out.println(s);
				}else {
					System.out.println(data[i]);
					
				}
				
			}
		}
	}
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		//System.out.println((5 - (count%5)));
		
		
		int[] data = new int[count];
		for(int i =0;i< count ; i++) {
			data[i]=scanner.nextInt();
		}
		gradeUpgrade(data);
	}
}
