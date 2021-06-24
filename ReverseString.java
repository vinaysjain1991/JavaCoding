package com.vinay.string;

/*
 * Question 1 : How to reverse a String in java? Can you write a program without using any java inbuilt methods?
 * */
public class ReverseString {

	public static void main(String[] args) {
		String str = "vinay";
		// 1. For Loop
		System.out.println(forLoop(str));

		// 2. Method Recursion
		System.out.println(recursiveReverse(str));

		// 3. StringBuffer
		System.out.println(stringBuffer(str));

	}

	private static String forLoop(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	public static String recursiveReverse(String orig) {

		if (orig.length() == 1) {
			return orig;
		}
		return orig.charAt(orig.length() - 1) + recursiveReverse(orig.substring(0, orig.length() - 1));

	}

	public static String stringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}

}
