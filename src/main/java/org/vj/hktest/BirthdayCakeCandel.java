package org.vj.hktest;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BirthdayCakeCandel {
	 static int birthdayCakeCandles(int n, int[] ar) {
	        // Complete this function
		 Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
	        for(int i=0;i<ar.length;i++){
	            if(map.containsKey(ar[i])){
	                map.put(ar[i], map.get(ar[i])+1);
	            }else {
	            		map.put(ar[i], 1);
	            }
	        }
	        
	        Map.Entry<Integer,Integer> maxObj = null ;
	        for(Map.Entry<Integer,Integer> entryOb : map.entrySet()) {
	        		if(maxObj==null || entryOb.getValue().compareTo(maxObj.getValue())>0) {
	        			maxObj=entryOb;
	        		}
	        }
	        System.out.println(map);
		 return maxObj.getKey();
	        
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(result);
	    }
}
