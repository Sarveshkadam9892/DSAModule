package com.recursion.main;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter n: ");
	    int n = sc.nextInt();
	    int fib = fib(n);
	    System.out.println("The " + n + "th Fibonacci number is: " + fib);
	  }

	  public static int fib(int n) {
	    if (n<= 1) {
	      return n;
	    } else {
	      return fib(n - 1) + fib(n - 2);
	    }
	  }
}