package org.vj.hktest;

public class Multiply {

	public static Double multiply(Double a , Double b) {
		return a*b;
	}
	public static void main(String args[]) {
		Double a = new Double(10.0);
		Double b =  new Double(20.0);
		System.out.println(multiply(a,b));
	}
}
