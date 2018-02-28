package org.vj.hktest;

  class A {
	 int k;
	 boolean istrue;
	 static int p;

	 public void printValue() {
	  System.out.print(k);
	  System.out.print(istrue);
	  System.out.print(p);
	 }
	}

	public class Test {
	 public static void main(String argv[]) {
	  A a = new A();
	  a.printValue();
	 }
	}