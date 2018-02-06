package org.vj.hktest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinnMaxArray {
	 static void miniMaxSum(int[] arr) throws Exception {
	        // Complete this function
		 
		 	List<Long> list = new ArrayList<Long>();
		    for (int value : arr) {
		        list.add((long) value);
		    }
		    
	        Collections.sort(list);
	        long minCount=0;long maxCount=0;
	        for(int i=0,j=1;i<list.size() && j<=list.size()-1;i++,j++){
	             minCount = minCount + list.get(i);
	             maxCount = maxCount + list.get(j);
	            System.out.println(minCount + " " + maxCount);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        try {
	        		miniMaxSum(arr);
	        }catch(Exception e) {
	        		e.printStackTrace();
	        }
	        in.close();
	    }
}
