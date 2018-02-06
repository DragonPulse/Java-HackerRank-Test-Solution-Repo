package org.vj.hktest;
import java.util.Scanner;

public class ModifySequence {

	static int modifySequenceCount(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(i<a.length-1) {
				
				if(a[i] == 0 && a[i+1] == 0) {
					a[i]=1;
				}
				
				if(!(a[i] <= a[i+1])) {
					a[i+1]=a[i]+a[i+1];
					count++;
				}
				
			}
			
		}
		
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
		return count;
	}

	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		int size = scanner.nextInt();
//		int[] ar = new int[size];
//		for (int ar_i = 0; ar_i < size; ar_i++) {
//			ar[ar_i] = scanner.nextInt();
//		}
		int ar[]= {0,0,0,0};
		System.out.println(modifySequenceCount(ar));
	}
}
