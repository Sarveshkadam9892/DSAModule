package com.recursion.main;

import java.util.Scanner;

public class PermutationsRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input = sc.nextLine();
	    System.out.println("All permutations of the string:");
	    printPermutations("", input);
	  }

	  public static void printPermutations(String prefix, String remaining) {
	    int length = remaining.length();
	    if (length == 0) {
	      System.out.println(prefix);
	    } else {
	      for (int i = 0; i < length; i++) {
	        String newPrefix = prefix + remaining.charAt(i);
	        String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
	        printPermutations(newPrefix, newRemaining);
	      }
	    }
	  }
	}


