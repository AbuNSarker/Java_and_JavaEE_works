/*------------------------------------------------------------------------
 * Problem 4: Java String Reverse
 * 
 * Task: 
 * 		Given a string A, print Yes if it is a palindrome, print No otherwise.
 * 		Note: A palindrome is a word, phrase, number, or other sequence of characters which reads 
 * 		the same backward or forward.characters in the inclusive range from start to end-1. You'll find the String class' 
 * 
 * Input Format: 
 * 		A will consist at most 50 lower case english letters.
 * 		Ex: madam
 * 
 * Constraints: A will consist at most 50 lower case english letters.
 * 
 * Output Format:
 *		Ex: Yes
 * 
 * Source: https://www.hackerrank.com/challenges/java-string-reverse/problem
 * ------------------------------------------------------------------------
 */

import java.util.Scanner;

public class P4_StringReverse {

	public static void main(String[] args) {
		/* Input section */
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		/* Reverse string */
		String reversed = new StringBuilder(str).reverse().toString();

		/* Compare to original */
		String result = str.equals(reversed) ? "Yes" : "No";
		System.out.println(result);
	}
}