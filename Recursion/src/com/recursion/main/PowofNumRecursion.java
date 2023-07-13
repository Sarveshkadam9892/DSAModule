package com.recursion.main;

import java.util.Scanner;

public class PowofNumRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter base: ");
	    int base = sc.nextInt();
	    System.out.print("Enter exponent: ");
	    int exponent = sc.nextInt();
	    int power = powerRecursive(base, exponent);
	    System.out.println(base + " raised to the power of " + exponent + " is: " + power);
	  }

	  public static int powerRecursive(int base, int exponent) {
	    if (exponent == 0) {
	      return 1;
	    } else {
	      return base * powerRecursive(base, exponent - 1);
	    }
	  }

}


