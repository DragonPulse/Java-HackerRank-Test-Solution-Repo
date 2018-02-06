package org.vj.hktest;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class DateTime {

	    static String timeConversion(String s) {
	        // Complete this function
	    	String ampm = s.substring(s.length()-2, s.length());
	    	
	    		String[] timeArray = s.split(":");
	    		String ss = timeArray[2].substring(0, 2);
	        StringBuilder sb = new StringBuilder("");
	        Integer hh = Integer.parseInt(timeArray[0]);
	        if(ampm.equals("AM") && hh<12) {
	        		sb.append(timeArray[0]);
	        }else if((ampm.equals("AM")) && hh==12){
	         	sb.append("00");
	        }else if((ampm.equals("PM") && hh==12) && (Integer.parseInt(timeArray[1])< 59) && (Integer.parseInt(ss)< 59)) {
	        		sb.append(timeArray[0]);
	        }else{
	        	sb.append(Integer.parseInt(timeArray[0])+12);
	        }
	       sb.append(":").append(timeArray[1]).append(":").append(timeArray[2].substring(0, 2));
	        return       sb.toString();
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = timeConversion(s);
	        System.out.println(result);
	    }
	}

