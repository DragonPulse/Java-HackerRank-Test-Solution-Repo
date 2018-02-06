package org.vj.hktest;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayCount {

	    static void plusMinus(int[] arr) {
	    		double fractionPositive = 0;
	        double fractionZero = 0;
	        double fractionNegative = 0;
	        for(int i=0;i<arr.length;i++){
	            if( arr[i] == 0){ 
	            	fractionZero++;
	            }else if (arr[i] > 0){ 
	            	fractionPositive++;
	            }else{ 
	            	fractionNegative++; 
	            }
	        }
	        DecimalFormat df = new DecimalFormat("#.#####");
	        
	        System.out.println(fractionPositive/arr.length);
	        System.out.println(fractionNegative/arr.length);
	        System.out.println(fractionZero/arr.length);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int arr_i = 0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        plusMinus(arr);
	        in.close();
	    }

}
