package org.vj.hktest;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TestOne {

    public static long mealCost(double mealCost,int tip,int tax){
       
    	return 1L;
    }
    
    public static void main(String[] args) {
        
        double meal_cost = 12.00;
        System.out.println("meal_cost"+meal_cost);
        int tip_percent = 20;
        System.out.println("tip_percent"+meal_cost*((double)tip_percent/100));
        int tax_percent = 8;
        System.out.println("tax_percent");
       
        System.out.println("The total meal cost is "+mealCost(meal_cost,tip_percent,tax_percent));
    }
}