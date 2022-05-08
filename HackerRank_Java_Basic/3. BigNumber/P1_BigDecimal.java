
/*------------------------------------------------------------------------
 * Problem 1: Java BigDecimal
 * 
 * Sample Input: 
 * 		9
 *	 	-100
 * 		50
 * 		0
 *	 	56.6
 * 		90
 * 		0.12
 * 		.12
 * 		02.34
 *	 	000.000
 * 
 * Sample Output
 *		90
 *		56.6
 *		50
 *		02.34
 *		0.12
 *		.12
 *		0
 *		000.000
 *		-100
 * 
 * Source: https://www.hackerrank.com/challenges/java-bigdecimal/problem
 * ------------------------------------------------------------------------
 */

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class P1_BigDecimal {
	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
	 * class should be named Solution.
	 */
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		// Write your code here
		Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
			public int compare(String s1, String s2) {
				BigDecimal b1 = new BigDecimal(s1);
				BigDecimal b2 = new BigDecimal(s2);
				return b1.compareTo(b2);
			}
		}));

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}