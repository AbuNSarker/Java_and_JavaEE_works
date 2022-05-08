
/*------------------------------------------------------------------------
 * Problem 1: Java Strings Introduction
 * 
 * Task: 
 * 		Given two strings of lowercase English letters,  A and B, perform the following operations:
 *
 *		1. Sum the lengths of  and .
 *		2. Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
 *		3. Capitalize the first letter in  and  and print them on a single line, separated by a space.
 * 
 * Input Format: 
 * 		The first line contains a string A. The second line contains another string B. The strings 
 * 		are comprised of only lowercase English letters.
 * 
 * Constraints: 
 * 
 * Output Format:
 *		There are three lines of output:
 *		For the first line, sum the lengths of A and B.
 *		For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
 *		For the third line, capitalize the first letter in both A  and B and print them on a single line, separated by a space.
 * 
 * Source: https://www.hackerrank.com/challenges/java-strings-introduction/problem
 * ------------------------------------------------------------------------
 */
import java.util.Scanner;

public class P1_StringsIntroduction {

	public static void main(String[] args) {
		/* Input section */
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		scan.close();

		/* Sum of the lengths of A and B */
		System.out.println(A.length() + B.length());

		/* Lexicographical order comparison */
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

		/* Output of the strings in required format */
		System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
	}

	private static String capFirstLetter(String str) {
		if (str == null || str.length() == 0) {
			return "";
		} else {
			return str.substring(0, 1).toUpperCase() + str.substring(1);
		}
	}
}