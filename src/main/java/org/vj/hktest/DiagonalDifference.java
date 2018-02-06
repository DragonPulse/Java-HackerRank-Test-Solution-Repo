package org.vj.hktest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        int rows,columns,difference,sumOfOneD,sumOfTwoD;
        sumOfOneD=0;sumOfTwoD=0;
        rows = a.length;
        columns=a.length;
       
        for(int i=0,j=0;i<rows && j<columns;i++,j++) {
        		sumOfOneD= sumOfOneD + a[i][j];
        }
        System.out.println(sumOfOneD);
        for(int i=0,j=columns-1;i<rows && j>=0;i++,j--) {
    			sumOfOneD= sumOfOneD + a[i][j];
        }
        
        return  sumOfOneD - sumOfTwoD;
        
        
     
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
