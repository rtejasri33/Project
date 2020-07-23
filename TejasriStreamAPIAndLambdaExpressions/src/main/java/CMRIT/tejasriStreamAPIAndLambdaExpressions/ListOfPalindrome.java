package CMRIT.tejasriStreamAPIAndLambdaExpressions;

import java.util.Arrays;
import java.util.List;


public class ListOfPalindrome {
	
	private static void printPalindrome(List<String> lst) {
		
		lst.stream()
		   .filter(s -> s.equalsIgnoreCase((new StringBuffer(s)).reverse().toString()))
		   .map(str -> str)
		   .forEach(str -> System.out.print(str + " "));
	}

	public static void main(String[] args) {
		
		/*
		 * The list contain -> [ "abba","abcd","abcba","abcddcba","dcba" ]
		 * Palindrome's in the list are -> ["abba" "abcba" "abcddcba"]
		 * Not Palindrome's in the list are -> ["abcd" "dcba"]
		 */
		
		List<String> lst = Arrays.asList("abba","abcd","abcba","abcddcba","dcba");
		System.out.print("Palindrome's in the array are : ");
		printPalindrome(lst);
	}
}