package org.vj.hktest;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ladder {

    static void staircase(int n) {
        // Complete this function
        String str ="#";
        for (int i=0;i<n;i++){ 
            System.out.printf("%"+n+"s%n",str);
            str=str+"#";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
