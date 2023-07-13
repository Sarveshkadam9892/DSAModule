package com.recursion.main;

import java.util.Scanner;

public class PalindromeRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input = sc.nextLine();
	    if (isPalindrome(input)) {
	      System.out.println(input + " is a palindrome.");
	    } else {
	      System.out.println(input + " is not a palindrome.");
	    }
	  }

	  public static boolean isPalindrome(String s) {
	    if (s.length() <= 1) {
	      return true;
	    } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
	      return false;
	    } else {
	      return isPalindrome(s.substring(1, s.length() - 1));
	    }
	  }
}

